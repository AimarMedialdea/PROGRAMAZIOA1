package dambat;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class IzartxoakController implements Initializable {
    @FXML
    VBox vboxErroa;

    @FXML
    TextField tfHasi;

    @FXML
    TextField tfAmaitu;

    @FXML
    TextField tfNon;

    @FXML
    TextArea taSegida;

    @FXML
    private void inprimatu() throws IOException {
        int hasiera = Integer.valueOf(tfHasi.getText());
        int amaiera = Integer.valueOf(tfAmaitu.getText());
        int zembatero = Integer.valueOf(tfNon.getText());

        for(int i = hasiera; i <= amaiera; i++){
            if(i % zembatero == 0){
                taSegida.appendText("*");
                if(i == amaiera){
                    taSegida.appendText(" \n");
                }else{
                    taSegida.appendText("\n");
                }

            }else{
                taSegida.appendText(i + " ");
                if(i == amaiera){
                    taSegida.appendText(" \n");
                }else{
                    taSegida.appendText("\n");
                }
            }
        }

    }
   

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        vboxErroa.setSpacing(10);
        vboxErroa.setPadding(new Insets(10));

    }





}