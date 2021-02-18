module org.openjfx {
    requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
    exports org.openjfx;
	opens org.openjfx;
}