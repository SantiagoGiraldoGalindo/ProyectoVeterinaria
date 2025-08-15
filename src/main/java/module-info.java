module co.edu.uniquindio.poo.veterinaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires javafx.graphics;

    requires javafx.base;

    // Paquetes abiertos para reflexión de JavaFX
    opens co.edu.uniquindio.poo.veterinaria to javafx.fxml;
    opens co.edu.uniquindio.poo.veterinaria.viewcontroller to javafx.fxml;

    // Paquetes exportados públicamente
    exports co.edu.uniquindio.poo.veterinaria;
}