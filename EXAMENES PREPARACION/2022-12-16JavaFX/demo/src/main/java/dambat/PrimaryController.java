package dambat;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField tfNombre;

    @FXML
    private TextField tfApellido;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfSueldo;

    
    @FXML
    private void pasoPag() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void crear() {
        ArrayList<Langilea> langilea = Langilea.getLangileenZerrenda();
        
        String nombre = tfNombre.getText();
        String apellido = tfApellido.getText();
        String email = tfEmail.getText();
        double sueldo = Double.valueOf(tfSueldo.getText());

        langilea.add(new Langilea(nombre, apellido, email, sueldo)); 

        }
    }
