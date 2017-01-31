/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.model;

import bikeshop.be.BikeProperty;
import bikeshop.bll.BikeManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BikeModel {

    private final ObservableList<BikeProperty> mBikesForSale;

    private final BikeManager mManager;

    public static BikeModel instance;

    public static BikeModel getInstance() {
        if (instance == null) {
            instance = new BikeModel();
        }
        return instance;
    }

    /**
     * Construct the Model
     */
    private BikeModel() {
        mBikesForSale = FXCollections.observableArrayList();
        mManager = new BikeManager();
        getAllBikes();
    }

    /**
     *
     * @return bikes for sale list
     */
    public ObservableList<BikeProperty> getBikesForSale() {
        return mBikesForSale;
    }

    /**
     * Create a BikeProperty from each "saved" bike and add it to the
     * ObservableList
     */
    private void getAllBikes() {
        mManager.getAllBikes().forEach((bike) -> {
            mBikesForSale.add(new BikeProperty(bike));
        });
    }

}
