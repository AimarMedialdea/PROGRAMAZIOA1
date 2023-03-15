package dambat;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Conexion;
import model.Rol;
import model.Usuario;

public class PrimaryController implements Initializable{
    //columnas
    @FXML
    private TableColumn<Usuario, String> clmNombre;
    @FXML
    private TableColumn<Usuario, String> clmApellido;
    @FXML
    private TableColumn<Usuario, String> clmEmail;
    @FXML
    private TableColumn<Usuario, Date> clmfecha;
    @FXML
    private TableColumn<Usuario, Rol> clmIdRoll;
    //componentes interfaz grafica
    @FXML
    private ComboBox<Rol> tablaName;
    @FXML
    private TableView<Usuario> tablaUsuario;
    //listas
    @FXML
    private ObservableList<Rol> listaRol;
    @FXML
    private ObservableList<Usuario> listaUs;
    private Conexion conexion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {



        conexion = new Conexion();
        conexion.establecerConexion();
        //iniciar listas
        listaRol = FXCollections.observableArrayList();
        listaUs = FXCollections.observableArrayList();
        //llenar listas
        Usuario.llenarTablaUsuario(conexion.getConnection(), listaUs);
        Rol.llenarInfo(conexion.getConnection(), listaRol);
        //enlazar listas y Tableview
        tablaName.setItems(listaRol);
        tablaUsuario.setItems(listaUs);

        //enlazar columnas con atributos
        clmNombre.setCellValueFactory(new PropertyValueFactory<Usuario, String>("nombreUsuario"));
        clmApellido.setCellValueFactory(new PropertyValueFactory<Usuario, String>("apellidoUsuario"));
        clmEmail.setCellValueFactory(new PropertyValueFactory<Usuario, String>("emailUsuario"));
        clmfecha.setCellValueFactory(new PropertyValueFactory<Usuario, Date>("fechaNacimiento"));
        //clmIdRoll.setCellValueFactory(new PropertyValueFactory<Usuario, Rol>("idRol"));  no funciona

        
        conexion.cerrarConexion();
    }

    @FXML
    private void pasoPag() throws IOException {
        App.setRoot("secondary");
    }

    

}
