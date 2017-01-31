/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controller;

import bikeshop.gui.model.BikeModel;
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

    private Node LIST_VIEW;

    private Node BOARD_VIEW;

    private boolean isListView;

    private final BikeModel bikeViewModel;

    public BikeshopMainController() {
        bikeViewModel = BikeModel.getInstance();
        //Make sure we start in the list view
        isListView = true;
        try {
            LIST_VIEW = getBikeList();
            BOARD_VIEW = getBikeBoard();
        } catch (Exception e) {
            System.out.println("OMG " + e + "\n");
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        borderPane.setCenter(LIST_VIEW);
    }

    /**
     * Interpolate the bikeBoard
     *
     * @return
     * @throws IOException
     */
    private Node getBikeBoard() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/bikeshop/gui/view/BikeBoard.fxml"));
        Node node = loader.load();
        BikeBoardController controller = loader.getController();
        controller.setBikeBoardModel(bikeViewModel);
        return node;
    }

    /**
     * Interpolate the bikeList
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

    /**
     * Switches the view
     *
     * @throws IOException
     */
    @FXML
    private void handleSwitchViewButton() throws IOException {
        if (isListView) {
            borderPane.setCenter(BOARD_VIEW);
            isListView = false;
        } else {
            borderPane.setCenter(LIST_VIEW);
            isListView = true;
        }
    }

}
