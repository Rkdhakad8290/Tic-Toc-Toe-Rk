module com.example.tic_tac_toyrk {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tic_tac_toyrk to javafx.fxml;
    exports com.example.tic_tac_toyrk;
}