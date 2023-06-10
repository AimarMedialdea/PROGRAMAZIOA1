package dambat.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import dambat.App;
import dambat.model.DatuAtzipena;
import dambat.model.base.Erreziboa;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class DiruzainaController implements Initializable {
  @FXML
  VBox vboxErroa;

  @FXML
  TextArea taErreziboak;
  
  @FXML
  Label lbGuztira;
 
 
  @FXML
  void hasierara() throws IOException {
    App.setRoot("hasierakoa");
  }

  /**
   * Eszenako textArean erreziboen zerrenda agertuko da.
   * Erreziboaren toString metodoa erabili.
   * lbGuztira labelean erreziboenBatura metodoak bueltatzen duena sartu
   */
  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    vboxErroa.setSpacing(10);
    vboxErroa.setPadding(new Insets(10));
   
    //OSATU METODO HAU

    //TextArea betetzeko

    ArrayList<Erreziboa> erreziboak = new ArrayList<Erreziboa>();

    erreziboak = DatuAtzipena.getErreziboak();

    for (int i = 0; i <= erreziboak.size(); i++) {
      taErreziboak.appendText(erreziboak.toString());
    }

    //guztira ateratzeko
    lbGuztira.setText(String.valueOf(DatuAtzipena.erreziboenBatura()));
    
  }

}
