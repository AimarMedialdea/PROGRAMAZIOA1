package dambat;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import java.lang.NumberFormatException;

public class LangileaSortuController implements Initializable {

    @FXML
    TextArea taSegida;

    @FXML
    TextField tfSoldata;

    @FXML
    TextField tfIzena;

    @FXML
    TextField tfAbizena;

    @FXML
    TextField tfEmaila;

    @FXML
    private void atzera() throws IOException {
        App.setRoot("menua");
    }

    @FXML
    private void ezabatu() throws IOException {
        taSegida.setText("");
        tfSoldata.setText(null);
        tfIzena.setText(null);
        tfAbizena.setText(null);
        tfEmaila.setText(null);
    }

    

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    }

    public void langileaSortu(){
         String izena = tfIzena.getText();
         String abizena = tfAbizena.getText();
         String emaila = tfEmaila.getText();
         int soldata = Integer.parseInt(tfSoldata.getText());



         Langilea langileberria = new Langilea(izena, abizena, emaila, soldata);

         App.lk.add(langileberria);

        if(taSegida.getText().equals("")){
            for(int i= 0; i<App.lk.size();i++){
                String langileString =App.lk.get(i).toString();
                taSegida.appendText(langileString + "\n");
            }
        }else {
                String langileString =App.lk.get(App.lk.size()-1).toString();
                taSegida.appendText(langileString + "\n");    
        }

        tfIzena.clear();
        tfAbizena.clear();
        tfEmaila.clear();
        tfSoldata.clear();
             
    }

         //Alternativamente podemos hacer esto
        /*if(taSegida.getText().equals("")){
            for(int i= 0; i<lk.size();i++){  
                taSegida.appendText( lk.get(i).getIzena() + " " + lk.get(i).getAbizena() + "\n"); 
            }
        }else{
            taSegida.appendText(lk.get(lk.size()-1).getIzena());
        }*/

}

