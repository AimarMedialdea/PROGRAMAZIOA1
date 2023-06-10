module dambat {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens dambat to javafx.fxml;
    opens dambat.model to javafx.fxml;
    opens dambat.model.base to javafx.base;
    opens dambat.controller to javafx.fxml;

    exports dambat;
    exports dambat.model;
    exports dambat.model.base;
}
