module com.mycompany.painterapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.painterapp to javafx.fxml;
    exports com.mycompany.painterapp;
}
