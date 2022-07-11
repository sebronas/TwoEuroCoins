package com.example.twoeurocoins;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


public class HelloController implements Initializable {


    @FXML
    private ListView<Coin> coin_list;

    @FXML
    private ListView<Coin> country_list;
    ObservableList<Coin> myCountryList;


    @FXML
    void loadCountryList() {
        DBConnection connectionNow = new DBConnection();
        Connection connectionDB = connectionNow.getConnection();

        String connectQuery = "Select * from coins";

        try {

            Statement statement = connectionDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(connectQuery);

            while (queryOutput.next()) {
                myCountryList = FXCollections.observableArrayList(new Coin(
                        queryOutput.getString("coin_name"),
                        queryOutput.getString("country"),
                        queryOutput.getString("coin_img"),
                        queryOutput.getString("country_code"),
                        queryOutput.getInt("coin_year"),
                        queryOutput.getString("mintage")
                ));

                /*myCountryList.add(new Coin(
                        queryOutput.getString("coin_name"),
                        queryOutput.getString("country"),
                        queryOutput.getString("coin_img"),
                        queryOutput.getString("country_code"),
                        queryOutput.getInt("coin_year"),
                        queryOutput.getString("mintage")
                ));*/

            }
            country_list.setItems(myCountryList);
            country_list.setCellFactory(new TheCellFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }


     /*   Coin coin1 = new Coin("Latgalian Pottery", "Latvia", "Latgalian_Pottery.jpg", "LV.png", 2021, 400000);
        Coin coin2 = new Coin("Lithuania", "Lithuania", "de_JureLV.jpg", "LT.png", 2021, 400000);
        Coin coin3 = new Coin("de_Jure", "Latvia", "de_JureLV.jpg", "LV.png", 2021, 400000);
*/
    /*    myCountryList = FXCollections.observableArrayList(coin1, coin2, coin3);
        country_list.setItems(myCountryList);
        country_list.setCellFactory(new TheCellFactory());
*/
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadCountryList();
    }
}