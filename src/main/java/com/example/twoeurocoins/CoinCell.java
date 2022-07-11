package com.example.twoeurocoins;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;

import java.io.IOException;

public class CoinCell extends ListCell<Coin> {

    @FXML
    Label name;

    public CoinCell() {loadFXML();}

    private void loadFXML() {
        System.out.println("at FXML");
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("coin_layout.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
