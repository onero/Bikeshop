/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.be;

public class Bike {

    public Bike() {

    }

    private String mType = "Awesome bike";

    private String mSeller = "Adamino";

    private double mPrice;

    public Bike(String type, String seller, double price) {
        this.mType = type;
        this.mSeller = seller;
        this.mPrice = price;
    }

    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public double getPrice() {
        return mPrice;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(double price) {
        this.mPrice = price;
    }

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public String getType() {
        return mType;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(String type) {
        this.mType = type;
    }

    /**
     * Get the value of seller
     *
     * @return the value of seller
     */
    public String getSeller() {
        return mSeller;
    }

    /**
     * Set the value of seller
     *
     * @param seller new value of seller
     */
    public void setSeller(String seller) {
        this.mSeller = seller;
    }

}
