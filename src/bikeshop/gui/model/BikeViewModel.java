/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.model;

import bikeshop.be.Bike;
import bikeshop.bll.BikeManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BikeViewModel {

    private final ObservableList<BikeModel> bikesForSale;

    private BikeManager manager;

    public BikeViewModel() {
        bikesForSale = FXCollections.observableArrayList();
        manager = new BikeManager();
        getAllBikes();
    }

    public ObservableList<BikeModel> getBikesForSale() {
        return bikesForSale;
    }

    private void getAllBikes() {
        for (Bike bike : manager.getAllBikes()) {
            bikesForSale.add(new BikeModel(bike));
        }
    }

}
