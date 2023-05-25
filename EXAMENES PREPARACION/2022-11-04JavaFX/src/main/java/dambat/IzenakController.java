package dambat;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    TableView<Pertsona> tvIzenak;

    @FXML
    TableColumn<Pertsona, String> tcIzena;

    @FXML
    Button btnReverse;

    @FXML
    Button btnOrdenatu;

    @FXML private ObservableList<Pertsona> listaIz;

    @FXML
    private void gehitu() throws IOException {
        String izena = tfIzena.getText();

        tfIzena.setText("");

        listaIz = FXCollections.observableArrayList();

        String[] izenak = izena.split(" ");  

        for(int i = 0; i < izenak.length; i++){
            listaIz.add(new Pertsona(izenak[i]));
            tcIzena.setCellValueFactory(new PropertyValueFactory<>("izena"));
        }

        tvIzenak.setItems(listaIz);

    }

    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        vboxErroa.setSpacing(10);
        vboxErroa.setPadding(new Insets(10));

    }

}