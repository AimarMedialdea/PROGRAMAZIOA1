package dambat.controller;

import java.io.IOException;
import java.net.URL;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ResourceBundle;

import dambat.App;
import dambat.model.DatuAtzipena;
import dambat.model.base.Bazkaria;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;

public class SukaldariaController implements Initializable {
  @FXML
  HBox hboxErroa;

  @FXML
  TextField tfEguna;
  @FXML
  TextField tfJana;
  @FXML
  TextField tfPrezioa;

  @FXML
  Label lbMezua;
  @FXML
  TableView<Bazkaria> tvBazkariak;

  @FXML
  TableColumn<Bazkaria, LocalDate> tcEguna;
  @FXML
  TableColumn<Bazkaria, String> tcJana;
  @FXML
  TableColumn<Bazkaria, Double> tcPrezioa;

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {

    hboxErroa.setSpacing(20);
    hboxErroa.setPadding(new Insets(20));
    
    ObservableList<Bazkaria> bazkariak = FXCollections.observableArrayList(); 
    bazkariak = FXCollections.observableArrayList(); 
    bazkariak.addAll(bazkariak);
    tvBazkariak.setItems(bazkariak);
    tcEguna.setCellValueFactory(new PropertyValueFactory<Bazkaria,LocalDate>("Eguna"));
    tcJana.setCellValueFactory(new PropertyValueFactory<Bazkaria,String>("Jana"));
    tcPrezioa.setCellValueFactory(new PropertyValueFactory<Bazkaria,Double>("Prezioa"));
    tvBazkariak.setItems(FXCollections.observableArrayList(DatuAtzipena.getBazkariak()));
    //TableViewa kargatu
    //OSATU METODOA

  }

  /**
   * Metodo honek erabiltzaileak sartutako datueki Bazkaria objektua sortzen du eta DatuAtzipena klaseko
   * bazkariaGehitu metodoari deitzen dio zerrendan gehitzeko. 
   * Ondo gehitu bada, textfield-ak "garbitu" eta mezu bat (Ondo gehi...)
   * Bestela, beste mezu bat (Egun horretarako baz...)
   * Erabiltzaileak datu ezegokiak sartu dituen try-catch bidez kontrolatuko da.   * 
   * 
   * @throws IOException
   */
  @FXML
  void handleGehitu() throws IOException {
    //OSATU METODO HAU
    
    ObservableList<Bazkaria> bazkariak = FXCollections.observableArrayList(); 
    try{
    LocalDate data = LocalDate.parse(tfEguna.getText());
    String jana = tfJana.getText();
    double prezioa = Double.valueOf(tfPrezioa.getText());
    
    Bazkaria bazkariaBerria = new Bazkaria(data, jana, prezioa);
    
    bazkariak = DatuAtzipena.getBazkariak();
    bazkariak.add(bazkariaBerria);

    tvBazkariak.setItems(bazkariak);
    tcEguna.setCellValueFactory(new PropertyValueFactory<Bazkaria,LocalDate>("Eguna"));
    tcJana.setCellValueFactory(new PropertyValueFactory<Bazkaria,String>("Jana"));
    tcPrezioa.setCellValueFactory(new PropertyValueFactory<Bazkaria,Double>("Prezioa"));
    
    //tvBazkariak.setItems(FXCollections.observableArrayList(DatuAtzipena.getBazkariak()));
    tvBazkariak.setItems(FXCollections.observableArrayList(bazkariak));
  } catch (DateTimeException e){
    lbMezua.setText("Eguna Formatu egokian sartu \nAd. 2023-05-30");
}catch (NumberFormatException e){
  lbMezua.setText("Prezioa zenbakia dela egiaztatu");
}


}
  
  

  @FXML
  void hasierara() throws IOException {
    App.setRoot("hasierakoa");
  }

  /**
   * Textfield guztiak garbitzen ditu.
   */
  public void garbitu() {
    tfEguna.clear();
    tfJana.clear();
    tfPrezioa.clear();
    //OSATU METODO HAU
  }
}

