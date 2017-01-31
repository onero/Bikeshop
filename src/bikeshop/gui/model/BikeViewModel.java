/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.model;

import bikeshop.be.Bike;
import bikeshop.be.BikeProperty;
import bikeshop.bll.BikeManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BikeViewModel {

    private final ObservableList<BikeProperty> BIKES_FOR_SALE;
    private final BikeManager BIKE_MANAGER = new BikeManager();

    private static BikeViewModel instance;

    public static BikeViewModel getInstance() {
        if (instance == null) {
            instance = new BikeViewModel();
        }
        return instance;
    }

    public BikeViewModel() {
        BIKES_FOR_SALE = FXCollections.observableArrayList();
        getAllBikes();
    }

    /**
     * Calls the BikeManager and gets all the bikes and puts it in an
     * ObservableList.
     */
    private void getAllBikes() {
        for (Bike bike : BIKE_MANAGER.getAllBikes()) {
            BIKES_FOR_SALE.add(new BikeProperty(bike));
        }
    }

    /**
     * Gets the observable list with all the bikeModels.
     *
     * @return
     */
    public ObservableList<BikeProperty> getObservableBikes() {
        return BIKES_FOR_SALE;
    }

}
