package dambat;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class IzenakController implements Initializable {
    @FXML
    VBox vboxErroa;

    @FXML
    TextField tfIzena;

    @FXML
    Button btnGehitu;

    @FXML
    TextField tfAmaitu;

    @FXML
    TableView tvIzenak;

    @FXML
    Button btnReverse;

    @FXML
    Button btnOrdenatu;


    @FXML
    private void gehitu() throws IOException {
        String izena = tfIzena.getText();

        String[] izenak = izena.split(" "); 

        for(int i = izenak.length - 1; i >= 0; i++){
            tvIzenak.getItems().add(izenak[i]);

        }



    }

    

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        vboxErroa.setSpacing(10);
        vboxErroa.setPadding(new Insets(10));

    }

}