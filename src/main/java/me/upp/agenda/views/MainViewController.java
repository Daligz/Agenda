package me.upp.agenda.views;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import me.upp.agenda.Agendar;
import me.upp.agenda.Contacto;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    //Agenda
    @FXML
    public TextArea txtNota;
    @FXML
    public DatePicker dateFecha;
    @FXML
    public ComboBox comboContacto;

    //Contacto
    @FXML
    public TextField contactoNombre;
    @FXML
    public TextField contactoTelefono;
    @FXML
    public TextField contactoCorreo;

    //Citas
    @FXML
    public TableView<Agendar> tablaCitas;
    @FXML
    public TableColumn<Agendar, LocalDate> columnFecha;
    @FXML
    public TableColumn<Agendar, String> columnNota;
    @FXML
    public TableColumn<Agendar, Contacto> columnContacto;

    @FXML
    public void agendaGuardar(ActionEvent actionEvent) {
        try {
            new Agendar(txtNota.getText(), dateFecha.getValue(), Contacto.getByName(comboContacto.getValue().toString()));
        } catch (Exception ex) {
            new Agendar(txtNota.getText(), dateFecha.getValue());
        }
        msg("Agendado para la fecha " + dateFecha.getValue(), "Agenda", "Guardado");
        txtNota.setText(null);
        dateFecha.setValue(null);
        comboContacto.setValue(null);
    }

    public void contactoGuardar(ActionEvent actionEvent) {
        new Contacto(contactoTelefono.getText(), contactoNombre.getText(), contactoCorreo.getText());
        msg("Se guardo el contacto " + contactoNombre.getText(), "Contacto", "Guardado");
        contactoTelefono.setText(null);
        contactoNombre.setText(null);
        contactoCorreo.setText(null);
        comboContacto.setItems(FXCollections.observableArrayList(Contacto.getContactosNombres()));
    }

    public void abrirCitas(Event event) {
        tablaCitas.setItems(FXCollections.observableArrayList(Agendar.getAgendas()));
    }


    private void msg(String message, String title, String headerMessage) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(headerMessage);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        columnFecha.setCellValueFactory(new PropertyValueFactory<>("Fecha"));
        columnNota.setCellValueFactory(new PropertyValueFactory<>("Nota"));
        columnContacto.setCellValueFactory(new PropertyValueFactory<>("Contacto"));
    }

}
