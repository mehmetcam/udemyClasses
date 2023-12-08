module com.example.wisequarter {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.wisequarter to javafx.fxml;
    exports com.example.wisequarter;
}