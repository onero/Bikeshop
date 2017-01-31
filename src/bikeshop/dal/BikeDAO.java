/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.dal;

import bikeshop.be.Bike;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BikeDAO {

    private static final double PRICE_INTERVAL = 2500;
    private static final double LOW_PRICE = 50;

    public List<Bike> getAllBikes() {
        ArrayList<Bike> returnList = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 25; i++) {
            Bike b = new Bike();
            b.setPrice(Math.round(LOW_PRICE + PRICE_INTERVAL * rnd.nextDouble()));
            b.setSeller(b.getSeller() + "_" + i);
            returnList.add(b);
        }
        return returnList;
    }

}
