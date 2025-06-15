module com.example.workwithinternet {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.workwithinternet to javafx.fxml;
    exports com.example.workwithinternet;
}