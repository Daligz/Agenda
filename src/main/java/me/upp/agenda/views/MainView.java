package me.upp.agenda.views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import me.upp.agenda.Agendar;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Agenda");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }
    

}
