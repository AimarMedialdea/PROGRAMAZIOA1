package dambat.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dambat.App;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class HasierakoaController implements Initializable {

  @FXML
  private VBox vboxErroa;

  @FXML
  public void handleBat() throws IOException {
      App.setRoot("sukaldaria");
  }

  @FXML
  public void handleBi() throws IOException {
     App.setRoot("erabiltzailea");
  }

  @FXML
  public void handleHiru() throws IOException {
     App.setRoot("diruzaina");
  }

  @Override
  public void initialize(URL arg0, ResourceBundle arg1) {
    vboxErroa.setSpacing(60);
    vboxErroa.setPadding(new Insets(60));

  }

}
