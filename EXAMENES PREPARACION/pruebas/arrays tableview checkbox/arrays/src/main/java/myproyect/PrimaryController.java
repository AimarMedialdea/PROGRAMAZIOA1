package myproyect;

import java.io.IOException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class PrimaryController {

        // 1- grafico hay que poner la clase de la que coges los datos y los tipos de datos(en el tableview solo la clase"User")
    @FXML TableView<User> tvUser;
    @FXML TableColumn<User, String> tcNombre;
    @FXML TableColumn<User, String> tcApellido;
    @FXML TableColumn<User, Number> tcEdad;
    @FXML TableColumn<User, String> tcDni;
    @FXML VBox vbox;
        // 2- observablelist<Clase.java>
    @FXML private ObservableList<User> listaObservable;  

    @FXML
    private void initialize(){

            // Obtener la lista de usuarios
        ArrayList<User> lista = User.getuserZerrenda();

            // 3- Iniciar lista(observablelist) 
        listaObservable = FXCollections.observableArrayList();

        listaObservable.addAll(lista); //añadir los datos del array al observablelist

            // 4- Enlazar lista(observableList) y tableview
        tvUser.setItems(listaObservable);

            // 5- Enlazar columnas con atributos
        tcNombre.setCellValueFactory(new PropertyValueFactory<User, String>("nombre"));
        tcApellido.setCellValueFactory(new PropertyValueFactory<User, String>("apellido"));
        tcEdad.setCellValueFactory(new PropertyValueFactory<User, Number>("edad"));
        tcDni.setCellValueFactory(new PropertyValueFactory<User, String>("dni"));

            // Agregar un CheckBox por cada usuario al HBox
        for (User user : lista) {
             CheckBox checkBox = new CheckBox(user.getNombre());
            vbox.getChildren().add(checkBox);
    }

    }


        /* 1- Obtiene la lista de usuarios utilizando el método getuserZerrenda() de la clase User.
        2- Inicia un ObservableList llamado listaObservable para almacenar los datos de la lista de usuarios.
        3- Agrega todos los elementos de la lista de usuarios al ObservableList utilizando el método addAll().
        4- Establece el ObservableList como la fuente de datos del TableView llamado tvUser.
        5- Enlaza las columnas del TableView con los atributos de la clase User utilizando PropertyValueFactory.
        6- Crea un CheckBox por cada usuario en la lista y establece el nombre del usuario como texto del CheckBox.
        7- Agrega cada CheckBox al VBox llamado vbox. */

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
