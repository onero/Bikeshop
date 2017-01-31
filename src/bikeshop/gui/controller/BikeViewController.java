/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controller;

import bikeshop.be.BikeProperty;
import bikeshop.gui.controls.BikeCellControls;
import bikeshop.gui.model.BikeModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Adamino
 */
public class BikeViewController implements Initializable {

    private BikeModel mModel;
    @FXML
    private ListView<BikeProperty> bikeView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeList();
    }

    /**
     * Fill the list cell
     */
    private void initializeList() {
        bikeView.setCellFactory(new Callback<ListView<BikeProperty>, ListCell<BikeProperty>>() {

            @Override
            public ListCell<BikeProperty> call(ListView<BikeProperty> param) {
                BikeCellControls<BikeProperty> cell = new BikeCellControls<>();
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
    public void setBikeBoardModel(BikeModel model) {
        this.mModel = model;
        bikeView.setItems(model.getObservableBikes());
    }

    @FXML
    private void handleBikeClicked() {
        try {
            showBike(bikeView.getSelectionModel().getSelectedItem());
        } catch (IOException ex) {
            Logger.getLogger(BikeViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showBike(BikeProperty bike) throws IOException {
        Stage primStage = (Stage) bikeView.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/bikeshop/gui/view/SingleBike.fxml"));
        Parent root = loader.load();
        SingleBikeController controller = loader.getController();
        controller.setModel(bike);
        Stage editStage = new Stage();
        editStage.setScene(new Scene(root));

        editStage.initModality(Modality.WINDOW_MODAL);
        editStage.initOwner(primStage);

        editStage.show();
    }

}
