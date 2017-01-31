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

    private BikeProperty mBikeModel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setModel(BikeProperty model) {
        mBikeModel = model;
        lblType.textProperty().bind(mBikeModel.typeProperty());
        lblSeller.textProperty().bind(mBikeModel.sellerProperty());
        lblPrice.textProperty().bind(mBikeModel.priceProperty().asString());
    }

}
