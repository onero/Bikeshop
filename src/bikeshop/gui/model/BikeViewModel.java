/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.model;

import bikeshop.bll.BikeManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BikeViewModel {

    private final ObservableList<BikeModel> mBikesForSale;

    private final BikeManager mManager;

    /**
     * Construct the Model
     */
    public BikeViewModel() {
        mBikesForSale = FXCollections.observableArrayList();
        mManager = new BikeManager();
        getAllBikes();
    }

    /**
     *
     * @return bikes for sale list
     */
    public ObservableList<BikeModel> getBikesForSale() {
        return mBikesForSale;
    }

    private void getAllBikes() {
        mManager.getAllBikes().forEach((bike) -> {
            mBikesForSale.add(new BikeModel(bike));
        });
    }

}
