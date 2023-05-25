package dambat;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SecondaryController {

    @FXML TextArea taGrande;
    @FXML
    private void pasoPag() throws IOException {
        App.setRoot("primary");
    }

    @Override
    public void initialize(arg1, arg2) {
        
    }
}