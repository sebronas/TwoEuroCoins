package com.example.twoeurocoins;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;


public class TheCellFactory implements Callback<ListView<Coin>, ListCell<Coin>> {

    @Override
    public ListCell<Coin> call(ListView<Coin> param) {
        return new CountryCell();
    }
}


