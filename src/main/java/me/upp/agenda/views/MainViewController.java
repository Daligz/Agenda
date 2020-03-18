package me.upp.agenda.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

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
    public void agendaGuardar(ActionEvent actionEvent) {
        //Acciones de cuando se preciona el boton guardar

        //Asi se obtiene un objeto, esto cambia el texto al precionar el boton
        txtNota.setText(" seppp ");

    }

}
