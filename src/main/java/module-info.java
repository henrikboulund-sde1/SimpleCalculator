module dk.easv.javafxsimplecalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens dk.easv.javafxsimplecalculator to javafx.fxml;
    exports dk.easv.javafxsimplecalculator;
}