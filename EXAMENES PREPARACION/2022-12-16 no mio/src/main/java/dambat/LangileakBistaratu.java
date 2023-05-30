package dambat;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class LangileakBistaratu implements Initializable  {

    @FXML
    TextField tfIzena;

    @FXML
    TextField tfAbizena;

    @FXML
    VBox vboxErroa;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }
    

    // este nos devuelve un atributo del objeto
    public void bistaratu()  throws IOException{
        String izena = tfIzena.getText();
        String abizena = tfAbizena.getText();

        Langilea langileBerria = new Langilea(izena, abizena);

        App.lk.add(langileBerria);

        if(vboxErroa.getChildren().size() == 0){
            for(int i = 0; i < App.lk.size(); i++){
            vboxErroa.getChildren().add(new Label(App.lk.get(i).getEmaila()));
            }  

        }else{
            vboxErroa.getChildren().add(new Label(String.valueOf(App.lk.get(App.lk.size()-1).getEmaila())));
        }

        tfIzena.clear();
        tfAbizena.clear();


    /*este nos devuelve todo el objeto
    public void bistaratu()  throws IOException{

        String izena = tfIzena.getText();
        String abizena = tfAbizena.getText();

        Langilea langileBerria = new Langilea(izena, abizena);

        App.lk.add(langileBerria);

        if(vboxErroa.getChildren().size() == 0){
            for (int i = 0; i < App.lk.size(); i++) {
                vboxErroa.getChildren().add(new Label(String.valueOf(App.lk.get(i).toString())));
            }
        }else{
                vboxErroa.getChildren().add(new Label(String.valueOf(App.lk.get(App.lk.size()-1).toString())));
            }

        tfIzena.clear();
        tfAbizena.clear();*/

    }
        

}
