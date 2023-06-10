package dambat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import dambat.model.DatuAtzipena;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("ENPRESAKO KAFETEGIA (Program 1. azken azterketa.2023-06-30)");
        DatuAtzipena.datuakKargatu();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hasierakoa" + ".fxml"));
        scene = new Scene(fxmlLoader.load(),900,700);
        System.out.println();
        scene.getStylesheets().add(getClass().getResource("css/ModenaAldatua.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
        
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}