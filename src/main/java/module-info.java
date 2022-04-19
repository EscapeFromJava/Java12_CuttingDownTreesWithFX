module com.example.java12_cuttingdowntreeswithfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java12_cuttingdowntreeswithfx to javafx.fxml;
    exports com.example.java12_cuttingdowntreeswithfx;
}