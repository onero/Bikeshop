/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controller;

import bikeshop.gui.model.BikeModel;
import bikeshop.gui.model.BikeViewModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author gta1
 */
public class BikeViewController implements Initializable {

    @FXML
    private ListView<BikeModel> bikeView;

    private BikeViewModel model;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bikeView.setCellFactory(new Callback<ListView<BikeModel>, ListCell<BikeModel>>() {

            @Override
            public ListCell<BikeModel> call(ListView<BikeModel> param) {
                BikeCellController<BikeModel> cell = new BikeCellController<>();
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/bikeshop/gui/view/BikeCellView.fxml"));
                    Node node = loader.load();
                    BikeCellViewController controller = loader.getController();
                    cell.setController(controller);
                    cell.setView(node);
                    cell.setGraphic(node);
                    return cell;
                } catch (IOException ex) {
                    Logger.getLogger(BikeCellViewController.class.getName()).log(Level.SEVERE, null, ex);
                }
                return cell;
            }
        });
    }

    /**
     * Set the model for the bikeboard
     *
     * @param model
     */
    public void setBikeBoardModel(BikeViewModel model) {
        this.model = model;
        bikeView.setItems(model.getBikesForSale());
    }

}
