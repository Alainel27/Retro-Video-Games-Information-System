module com.example.retrovideogamesinformationsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.retrovideogamesinformationsystem to javafx.fxml;
    exports com.example.retrovideogamesinformationsystem;
    exports com.example.retrovideogamesinformationsystem.Controllers;
    opens com.example.retrovideogamesinformationsystem.Controllers to javafx.fxml;
}