package dambat;

import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondaryController {
    @FXML
    Label label1;

    @FXML
    Label label2;

    @FXML
    Label label3;

    @FXML
    Label label4;

    @FXML
    Button ran;

    @FXML
    Button listo;

    @FXML
    TextField text1;

    @FXML
    TextField text2;

    @FXML
    Label zuzen;

    @FXML
    Label oker;

    @FXML
    private void random() {
        Random random = new Random();

        int rand = random.nextInt(9);
        int rand2 = random.nextInt(9);
        int rand3 = random.nextInt(9);
        int rand4 = random.nextInt(9);

        String strand1 = Integer.toString(rand);
        String strand2 = Integer.toString(rand2);
        String strand3 = Integer.toString(rand3);
        String strand4 = Integer.toString(rand4);

        label1.setText(strand1);
        label2.setText(strand2);
        label3.setText(strand3);
        label4.setText(strand4);
    }

    @FXML
    private void dale() {
        int d1 = Integer.parseInt(label1.getText());
        int d2 = Integer.parseInt(label2.getText());
        int i1 = Integer.parseInt(label3.getText());
        int i2 = Integer.parseInt(label4.getText());
        int respuesta1 = Integer.parseInt(text1.getText());
        int respuesta2 = Integer.parseInt(text2.getText());

        int total1 = d1 * i1;
        int total2 = d2 * i2;

        if (respuesta1 == total1 && respuesta2 == total2) {
            int testo = Integer.parseInt(zuzen.getText());
            int tTotal = testo += 1;
            String strTotal = Integer.toString(tTotal);
            zuzen.setText(strTotal);
        } else {
            int testo = Integer.parseInt(oker.getText());
            int tTotal = testo += 1;
            String strTotal = Integer.toString(tTotal);
            oker.setText(strTotal);
        }

    }

}