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
    Label operazio;

    @FXML
    Label cont;

    @FXML
    Label erantzun;

    @FXML
    private void random() {

        if (text1.getText() != "" && text2.getText() != "") {
            erantzun.setText("");
            text1.setText("");
            text2.setText("");

            int count = Integer.parseInt(cont.getText());
            int cTotal = count += 1;
            String strCount = Integer.toString(cTotal);
            cont.setText(strCount);

            Random random = new Random();
            int randChar = random.nextInt(3);
            if (randChar == 0) {
                operazio.setText("+");
            } else if (randChar == 1) {
                operazio.setText("-");
            } else if (randChar == 2) {
                operazio.setText("/");
            } else if (randChar == 3) {
                operazio.setText("X");
            }

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
        }else{
            erantzun.setText("Sartu erantzuna lelen!");
        }

    }

    @FXML
    private void dale() {
        int d1 = Integer.parseInt(label1.getText());
        int d2 = Integer.parseInt(label2.getText());
        int i1 = Integer.parseInt(label3.getText());
        int i2 = Integer.parseInt(label4.getText());
        int respuesta1 = Integer.parseInt(text1.getText());
        int respuesta2 = Integer.parseInt(text2.getText());

        String opTxt = operazio.getText();
        if (opTxt == "X") {
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
        } else if (opTxt == "+") {
            int total1 = d1 + i1;
            int total2 = d2 + i2;

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
        } else if (opTxt == "-") {
            int total1 = d1 - i1;
            int total2 = d2 - i2;

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
        } else if (opTxt == "/") {
            int total1 = d1 * i2;
            int total2 = d2 * i1;

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

}