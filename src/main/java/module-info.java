module com.example.checkersgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.checkersgame to javafx.fxml;
    exports com.example.checkersgame;
}