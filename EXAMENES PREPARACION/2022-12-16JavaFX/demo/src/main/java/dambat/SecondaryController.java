package dambat;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SecondaryController {

    @FXML
    private TextArea taGrande;

    public SecondaryController() {
    }

    @FXML
    private void pasoPag() throws IOException {
        App.setRoot("primary");
    }

    public void actualizarTextArea(ArrayList<Langilea> listado) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Langilea langilea : listado) {
            stringBuilder.append(langilea.toString()).append("\n");
        }
        taGrande.setText(stringBuilder.toString());
    }
}