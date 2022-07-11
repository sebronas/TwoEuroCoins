package com.example.twoeurocoins;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class CountryCell extends ListCell<Coin> {

    @FXML
    ImageView countryFlag;

    @FXML
    Label countryName;

    public CountryCell() {
        loadFXML();
    }

    private void loadFXML() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("country_layout.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    int a;
    @Override
    public void updateItem(Coin item, boolean empty) {
        System.out.println("AT UPDATE....");
        super.updateItem(item, empty);

        if(empty || item == null) {
            setText(null);
            setContentDisplay(ContentDisplay.TEXT_ONLY);
        }
        else {
            Image img = new Image(getClass().getResourceAsStream("/img/"+item.getCountryImgURL() ));
            countryFlag.setImage(img);
            countryName.setText(item.country);

            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        }
    }

}
