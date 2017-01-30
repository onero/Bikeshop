/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.model;

import bikeshop.be.Bike;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class BikeModel {

    private final StringProperty mType = new SimpleStringProperty();
    private final StringProperty mSeller = new SimpleStringProperty();
    private final DoubleProperty mPrice = new SimpleDoubleProperty();

    private Bike mBike;

    /**
     *
     * @param bike
     */
    public BikeModel(Bike bike) {
        mBike = bike;
        mType.set(bike.getType());
        mSeller.set(bike.getSeller());
        mPrice.set(bike.getPrice());
    }

    /**
     *
     * @return price
     */
    public double getPrice() {
        return mPrice.get();
    }

    /**
     * Set the price of the bike
     *
     * @param value as double
     */
    public void setPrice(double value) {
        mPrice.set(value);
        mBike.setPrice(value);
    }

    /**
     *
     * @return price property
     */
    public DoubleProperty priceProperty() {
        return mPrice;
    }

    /**
     *
     * @return seller
     */
    public String getSeller() {
        return mSeller.get();
    }

    /**
     * Set the seller of the bike
     *
     * @param value
     */
    public void setSeller(String value) {
        mSeller.set(value);
        mBike.setSeller(value);
    }

    /**
     *
     * @return seller property
     */
    public StringProperty sellerProperty() {
        return mSeller;
    }

    /**
     *
     * @return type of bike
     */
    public String getType() {
        return mType.get();
    }

    /**
     * Set the bike type
     *
     * @param value
     */
    public void setType(String value) {
        mType.set(value);
        mBike.setType(value);
    }

    /**
     *
     * @return type property
     */
    public StringProperty typeProperty() {
        return mType;
    }

    /**
     *
     * @return bike
     */
    public Bike getBike() {
        return mBike;
    }

}
