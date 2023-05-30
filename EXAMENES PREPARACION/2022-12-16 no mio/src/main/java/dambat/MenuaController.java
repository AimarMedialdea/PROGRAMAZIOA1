package dambat;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class MenuaController implements Initializable{

    @FXML
    VBox vboxErroa;

    @FXML
    Button btnIzartxoak;

    @FXML
    private void switchToSortu() throws IOException {
        App.setRoot("langileaSortu");
    }

    @FXML
    private void switchToLangileLista() throws IOException {
        App.setRoot("langileLista");
    }

    @FXML
    private void switchToTableviw() throws IOException {
        App.setRoot("tableView");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        vboxErroa.setSpacing(10);
        vboxErroa.setPadding(new Insets(10));
   
    }
}
