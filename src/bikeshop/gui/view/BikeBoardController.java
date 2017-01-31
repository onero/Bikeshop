/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.view;

import bikeshop.gui.model.BikeViewModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.FlowPane;

/**
 * FXML Controller class
 *
 * @author gta1
 */
public class BikeBoardController implements Initializable {

    @FXML
    private FlowPane bikeBoard;

    private BikeViewModel mModel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * Set the model for the bikeboard
     *
     * @param model
     */
    public void setBikeBoardModel(BikeViewModel model) {
        mModel = model;
//        bikeBoard.(model.getBikesForSale());
    }

}
