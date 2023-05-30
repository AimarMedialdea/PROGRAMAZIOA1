module miproyecto {
    requires javafx.controls;
    requires javafx.fxml;

    opens miproyecto to javafx.fxml;
    exports miproyecto;
}
