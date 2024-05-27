module com.intelidia.simplejavafxapp.simplejavafxapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.intelidia.simplejavafxapp.simplejavafxapp to javafx.fxml;
    exports com.intelidia.simplejavafxapp.simplejavafxapp;
}