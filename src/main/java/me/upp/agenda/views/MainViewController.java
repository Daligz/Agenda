package me.upp.agenda.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import me.upp.agenda.Agenda;
import me.upp.agenda.Agendar;
import me.upp.agenda.Contacto;

import java.net.URL;
import java.util.ResourceBundle;


public class MainViewController {

    @FXML
    public TextArea txtNota;
    @FXML
    public DatePicker dateFecha;
    @FXML
    public ComboBox comboContacto;
    @FXML
    private TextField nom;
    @FXML
    private TextField tel;
    @FXML
    private TextField correo;
    @FXML
    private TableView<Agendar> tabla;
    @FXML
    private TableColumn fecha;
    @FXML
    private TableColumn nota;
    @FXML
    private TableColumn contacto;
    
    private ObservableList<Agendar> agendar;
    
    public void inicilize(URL url,ResourceBundle rb){
        agendar=FXCollections.observableArrayList();
        
       this.fecha.setCellValueFactory(new PropertyValueFactory("Fecha"));
    }
    
    @FXML
    public void agendaGuardar(ActionEvent actionEvent) {

        try {
            new Agendar(txtNota.getText(), dateFecha.getValue(), Contacto.getByName(comboContacto.getValue().toString()));
        } catch (Exception ex) {
            new Agendar(txtNota.getText(), dateFecha.getValue());
        }

        for (Agendar agenda : Agendar.getAgendas()) {
            msg(
                    agenda.getNota() + " - " + agenda.getFecha() + " - " + agenda.getContacto(),
                    "TITULO JAJA xd", "Nop"
            );
        }
    }

    @FXML
    private void contactoGuardar(ActionEvent event) {
    }


    public void msg(String message, String title, String headerMessage) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(headerMessage);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
