module com.example.flashcard_learningsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flashcard_learningsystem to javafx.fxml;
    exports com.example.flashcard_learningsystem;
}