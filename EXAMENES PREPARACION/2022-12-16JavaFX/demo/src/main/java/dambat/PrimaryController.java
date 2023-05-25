package dambat;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField tfNombre;
    @FXML TextField tfApellido;
    @FXML TextField tfEmail;
    @FXML TextField tfSueldo;
    
    @FXML
    private void pasoPag() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void crear(){
        ArrayList<Langilea> langilea = new ArrayList<Langilea>();
        
        String nombre = tfNombre.getText();
        String apellido = tfApellido.getText();
        String email = tfEmail.getText();
        double sueldo = Integer.valueOf(tfSueldo.getText());

        Langilea l1 = new Langilea(nombre, apellido, email, sueldo);

        
    }
}
