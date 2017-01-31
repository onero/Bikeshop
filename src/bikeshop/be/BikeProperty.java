/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.be;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class BikeProperty {

    private final StringProperty mType;
    private final StringProperty mSeller;
    private final DoubleProperty mPrice;

    private Bike bike;

    public BikeProperty(Bike bike) {
        mType = new SimpleStringProperty();
        mSeller = new SimpleStringProperty();
        mPrice = new SimpleDoubleProperty();
        this.bike = bike;
        mType.set(bike.getType());
        mSeller.set(bike.getSeller());
        mPrice.set(bike.getPrice());
    }

    /**
     * Gets the bike.
     *
     * @return
     */
    public Bike getBike() {
        return bike;
    }

    /**
     * Sets the bike.
     *
     * @param bike
     */
    public void setBike(Bike bike) {
        this.bike = bike;
    }

    /**
     * Gets the property of type.
     *
     * @return
     */
    public StringProperty typeProperty() {
        return mType;
    }

    /**
     * Gets the property of seller.
     *
     * @return
     */
    public StringProperty sellerProperty() {
        return mSeller;
    }

    /**
     * Gets the propert of price.
     *
     * @return
     */
    public DoubleProperty priceProperty() {
        return mPrice;
    }

    /**
     * Gets the type.
     *
     * @return
     */
    public String getType() {
        return mType.get();
    }

    /**
     * Gets the seller.
     *
     * @return
     */
    public String getSeller() {
        return mSeller.get();
    }

    /**
     * Gets the price.
     *
     * @return
     */
    public double getPrice() {
        return mPrice.get();
    }

    /**
     * Sets the type.
     *
     * @param value
     */
    public void setTyp(String value) {
        mType.set(value);
        bike.setType(value);
    }

    /**
     * Sets the seller.
     *
     * @param value
     */
    public void setSeller(String value) {
        mSeller.set(value);
        bike.setSeller(value);
    }

    /**
     * Sets the price.
     *
     * @param value
     */
    public void setPrice(double value) {
        mPrice.set(value);
        bike.setPrice(value);
    }

}
