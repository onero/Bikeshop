/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controller;

import bikeshop.gui.model.BikeViewModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Adamino
 */
public class BikeshopMainController implements Initializable {

    @FXML
    private BorderPane borderPane;

    private BikeViewModel bikeViewModel;

    public BikeshopMainController() {
        bikeViewModel = new BikeViewModel();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            borderPane.setCenter(getBikeList());
        } catch (Exception e) {
            System.out.println("OMG " + e);
        }
    }

    /**
     * Interpolate the bikeView
     *
     * @return
     * @throws IOException
     */
    private Node getBikeList() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/bikeshop/gui/view/BikeView.fxml"));
        Node node = loader.load();
        BikeViewController controller = loader.getController();
        controller.setBikeBoardModel(bikeViewModel);
        return node;
    }

}
