package dambat.controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import dambat.App;
import dambat.model.DatuAtzipena;
import dambat.model.base.Bazkaria;
import dambat.model.base.Erabiltzailea;
import dambat.model.base.Erreziboa;
import dambat.model.base.Hobariduna;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ErabiltzaileaController implements Initializable {
  @FXML
  VBox vboxErroa;

  @FXML
  HBox hboxErabil;

  @FXML
  TextField tfNana;

  @FXML
  Label lbIzenAbizena;

  @FXML
  Label lbMezu1;

  @FXML
  VBox vboxBazkariak;

  @FXML
  Label lbMezu2;

  @FXML
  Button btErreziboaSortu;

  private Erabiltzailea erabiltzailea = null;

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    vboxErroa.setSpacing(10);
    vboxErroa.setPadding(new Insets(10));
    hboxErabil.setSpacing(10);
    hboxErabil.setPadding(new Insets(10));
    vboxBazkariak.setSpacing(10);
    vboxBazkariak.setPadding(new Insets(10));
    btErreziboaSortu.setVisible(false);
  }

  /**
   * DatuAtzipena klaseko nanaBilatu metodoak erabiltzaile bat bueltatzen diguna erabiltzailea atributoari asignatu ondoren.
   * Erabiltzailea ondo identifikatu bada:   * 
   * 1. lbIzenAbizena labelean izen abizenak bistaratu
   * 2. lbMezu1 labelean "Zein egunetan etorriko zara bazkaltzen?"
   * 3. CheckBoxak sortu txekBoxakSortu metodoari deitu
   * 4. btErreziboaSortu "visible" jarri
   * 
   * NAN hori erregistratuta ez badaukagu:
   * 1. lbIzenAbizena labelean: "NAN ezezaguna."
   * 2. btErreziboaSortu "visible" jarri
   */
  @FXML
  private void egiaztatu() throws IOException {
    erabiltzailea = DatuAtzipena.nanaBilatu(tfNana.getText());

    if(erabiltzailea == null){
      lbIzenAbizena.setText("NAN ezezaguna.");
      btErreziboaSortu.setVisible(true);
    }else if(erabiltzailea != null){
      lbIzenAbizena.setText(erabiltzailea.getIzena() + " " + erabiltzailea.getAbizena());
      lbMezu1.setText("Zein egunetan etorriko zara bazkaltzera? ");
      txekBoxakSortu();
      btErreziboaSortu.setVisible(true);
    }
  }

  /**
   * vBoxBazkariak izeneko kontrolaren azpian CheckBox berriak gehitu.
   * Checkbox bat, iragan ez den egun bakoitzeko.
   * Erakutsi beharreko testua, enuntziatuan kontsultatu.
   */
  private void txekBoxakSortu() {

    for(Bazkaria b : DatuAtzipena.getBazkariak()){
      CheckBox checkBox = new CheckBox();
      checkBox.setText(b.getEguna().toString() + " " + b.getJana() + " (" + b.getPrezioa() + " €)");
      checkBox.setId(b.getEguna().toString());
      vboxBazkariak.getChildren().add(checkBox);
    }
  }

  /**
   * Erabiltzaileak aukeratutako bazkarien araberako erreziboa sortu eta erreziboen zerrendan gehitzen du.
   * 1. CheckBoxetan dagoen informazioa errebisatuta, erreziboa sortzeko behar duen informazioa "harrapatzen" du.
   * 2. Guztira ez bada 0, erabiltzaile hobariduna den egiaztatu eta deskontua aplikatzen du.
   * 3. Erreziboa sortu eta zerrendan gehitu erreziboaGehitu metodoari deituta.
   * 4. lbMezu2 labelean mezu egokia atera:
   *      - Momentuz, ez daukazu baliozko bazkaririk aukeratuta.
   *      - XXX euroko erreziboa sortu zaizu. [(Deskontua: 0.4)]
   */
  @FXML
  void erreziboaSortu() throws IOException {
/*     Erreziboa erreziboa = new Erreziboa(LocalDate.now(), erabiltzailea.getNan(), null, 0.0, 0.0);
    ArrayList<Bazkaria> aukeratuBazk = new ArrayList<>(); */
  }

  @FXML
  void hasierara() throws IOException {
    App.setRoot("hasierakoa");
  }

}
