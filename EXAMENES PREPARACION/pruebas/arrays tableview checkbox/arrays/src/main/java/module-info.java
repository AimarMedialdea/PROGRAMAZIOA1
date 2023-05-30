module myproyect {
    requires javafx.controls;
    requires javafx.fxml;

    opens myproyect to javafx.fxml;
    exports myproyect;
}
