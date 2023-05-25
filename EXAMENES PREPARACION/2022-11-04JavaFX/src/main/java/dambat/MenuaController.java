package dambat;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MenuaController implements Initializable{

    @FXML
    VBox vboxErroa;

    @FXML
    Button btnIzartxoak;

    @FXML
    private void switchToIzartxoak() throws IOException {
        App.setRoot("izartxoak");
    }

    @FXML
    private void switchToIzenak() throws IOException {
        App.setRoot("izenak");
    }

    @FXML
    private void switchToDatak() throws IOException {
        App.setRoot("datak");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        vboxErroa.setSpacing(10);
        vboxErroa.setPadding(new Insets(10));
   
    }
}
