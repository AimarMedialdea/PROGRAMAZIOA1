module dambat {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens dambat to javafx.fxml;
    exports dambat;
}
