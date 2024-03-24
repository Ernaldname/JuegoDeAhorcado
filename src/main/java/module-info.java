module com.example.juegodeahorcado {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.juegodeahorcado to javafx.fxml;
    exports com.example.juegodeahorcado;
}