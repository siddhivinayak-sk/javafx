module org.openjfx {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.graphics;
    exports javafxtest1;
    exports javafxtest1.controllers;
    opens javafxtest1;
    opens javafxtest1.controllers;
}