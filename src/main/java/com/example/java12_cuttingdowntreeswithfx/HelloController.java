package com.example.java12_cuttingdowntreeswithfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    TextArea txtArea;
    @FXML
    Label labelResult;
    public void onCreateButtonClick(ActionEvent actionEvent) {
        String[] lines = txtArea.getText().split(" ");
        int totalNumber = Integer.parseInt(lines[0]);
        int mustStay = Integer.parseInt(lines[1]);
        int space = 1;
        int count = totalNumber - mustStay + 1;
        while(mustStay + (space * (mustStay - 1)) - 1 <= totalNumber){
            if (mustStay + (space * (mustStay - 1)) - 1 <= totalNumber)
                count += totalNumber - (mustStay + (space * (mustStay - 1))) + 1;
            space++;
        }
        if (count > 0)
            labelResult.setText("Result: " + count);
        else
            labelResult.setText("Result: 0");
    }
}