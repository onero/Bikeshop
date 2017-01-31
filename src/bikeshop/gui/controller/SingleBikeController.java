/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controller;

import bikeshop.be.BikeProperty;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Adamino
 */
public class SingleBikeController implements Initializable {

    @FXML
    private Label lblType;
    @FXML
    private Label lblSeller;
    @FXML
    private Label lblPrice;

    private BikeProperty mBike;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setModel(BikeProperty bike) {
        mBike = bike;
        lblType.textProperty().bind(bike.typeProperty());
        lblSeller.textProperty().bind(bike.sellerProperty());
        lblPrice.textProperty().bind(bike.priceProperty().asString());
    }

}
