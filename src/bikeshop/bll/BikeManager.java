/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.bll;

import bikeshop.be.Bike;
import bikeshop.dal.BikeDAO;
import java.util.List;

public class BikeManager {

    private BikeDAO bikeDAO;

    public BikeManager() {
        bikeDAO = new BikeDAO();
    }

    public List<Bike> getAllBikes() {
        return bikeDAO.getAllBikes();
    }

}
