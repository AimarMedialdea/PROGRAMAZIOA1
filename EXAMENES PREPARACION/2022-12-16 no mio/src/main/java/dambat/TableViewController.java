package dambat;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class TableViewController implements Initializable{

    @FXML
    TextField tfIzena;

    @FXML
    TextField tfAbizena;

    @FXML
    TableView tvLangileak;
    
    @FXML
    TableColumn tcIzena;

    @FXML
    TableColumn tcAbizena;

    @FXML
    TableColumn tcEmaila;

    @FXML
    TableColumn tcSoldata;

    public void langileakBistaratu(){
        String izena = tfIzena.getText();
        String abizena =tfAbizena.getText();

        Langilea langileBerria = new Langilea(izena, abizena);

        App.lk.add(langileBerria);

        tcIzena.setCellValueFactory(new PropertyValueFactory<>("Izena"));
        tcAbizena.setCellValueFactory(new PropertyValueFactory<>("Abizena"));
        tcEmaila.setCellValueFactory(new PropertyValueFactory<>("Emaila"));
        tcSoldata.setCellValueFactory(new PropertyValueFactory<>("Soldata"));
        tvLangileak.setItems(FXCollections.observableArrayList(App.lk));

        tfIzena.clear();
        tfAbizena.clear();
    }




    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    }
    
}
