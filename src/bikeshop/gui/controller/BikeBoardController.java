/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controller;

import bikeshop.be.BikeProperty;
import bikeshop.gui.model.BikeViewModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;

/**
 * FXML Controller class
 *
 * @author gta1
 */
public class BikeBoardController implements Initializable {

    private BikeViewModel mBikeViewModel;

    @FXML
    private FlowPane bikeBoard;
    @FXML
    private ScrollPane containerForBikeBoard;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Set the size of the ScrollPane to the board
        bikeBoard.prefWidthProperty().bind(containerForBikeBoard.widthProperty());
    }

    /**
     * Set the model for the bikeboard
     *
     * @param model
     */
    public void setBikeBoardModel(BikeViewModel model) {
        mBikeViewModel = model;
        loadBikes();
    }

    /**
     * Load all the bikes into the flowpane
     */
    private void loadBikes() {
        for (BikeProperty bikeModel : mBikeViewModel.getObservableBikes()) {
            try {
                bikeBoard.getChildren().add(getBikeNodes(bikeModel));
            } catch (IOException ex) {
                System.out.println("Load bikes error: " + ex);
            }
        }
    }

    /**
     * Load individual bikes
     *
     * @param model
     * @return
     * @throws IOException
     */
    private Node getBikeNodes(BikeProperty model) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/bikeshop/gui/view/SingleBike.fxml"));
        AnchorPane bike = loader.load();
        SingleBikeController singleBikeController = loader.getController();
        singleBikeController.setModel(model);
        return bike;
    }

}
