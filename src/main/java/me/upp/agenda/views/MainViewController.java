package me.upp.agenda.views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import me.upp.agenda.Agendar;


public class MainViewController {

    /*
    Para obtener el objeto grafico
    se debe de hacer referencia con el
            fx:id="txtNota"
    que se encuentra en el main.fxml
    el id que se le asigne debe de ser el mismo
    por el cual sera identificada la variable,
    por eso la variable es igual al id (txtNota)
     */
    @FXML
    public TextArea txtNota;
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
        //Acciones de cuando se preciona el boton guardar

        //Asi se obtiene un objeto, esto cambia el texto al precionar el boton
        txtNota.setText(" seppp ");

    }

    @FXML
    private void contactoGuardar(ActionEvent event) {
    }
   
   
}
