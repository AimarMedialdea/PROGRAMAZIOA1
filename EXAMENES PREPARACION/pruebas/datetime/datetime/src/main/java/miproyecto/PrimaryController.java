package miproyecto;

import java.io.IOException;
import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField tfFecha;
    @FXML TextArea taFecha;
    @FXML DatePicker dpDate;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void pasarFecha() throws IOException {

    //coger un string de una fehca y pasarlo al DatePicker y al TextArea

            //coge el String que ha metido el usuario "23/04/2001"(String)
        String fechaU = tfFecha.getText();
            //imprime el texto que ya habia en el text area + "fechaU"
        taFecha.setText(taFecha.getText() + "\n" +fechaU);
            //al DatePicker hay que pasarle un string, no una fecha como tal, entonces uso "fechaU" que ha metido el usuario para poner una fecha
        dpDate.setPromptText(fechaU);

/*             //guardo un formato de fecha en "formato"(x/xx/xxxx)
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/yyyy");

            //creo un LocalDate "fecha" para convertir el String "fechaU" en LocalDate con formato "formato"
        LocalDate fecha = LocalDate.parse(fechaU, formato); */
    }

    @FXML
    private void pasarDp(){
    //coger la fecha del DatePicker y pasarlo al TexArea

        //creo un LocalDate para guardar el valor del DatePicker
        LocalDate data = dpDate.getValue();
        //imprime el texto que ya habia en el text area + "data"
        taFecha.setText(taFecha.getText() + "\n" + data);
    }
}
