/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controller;

import bikeshop.be.BikeProperty;
import bikeshop.gui.model.BikeModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setModel(BikeProperty model) {
        lblType.textProperty().bind(model.typeProperty());
        lblSeller.textProperty().bind(model.sellerProperty());
        lblPrice.textProperty().bind(model.priceProperty().asString());
    }

    @FXML
    private void handleShowBike() throws IOException {

        Stage primStage = (Stage) lblType.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/bikeshop/gui/view/SingleBike.fxml"));
        Parent root = loader.load();
        SingleBikeController controller = loader.getController();
        //TODO ALH: MAKE DYNAMIC!
        controller.setModel(BikeModel.getInstance().getObservableBikes().get(0));
        Stage editStage = new Stage();
        editStage.setScene(new Scene(root));

        editStage.initModality(Modality.WINDOW_MODAL);
        editStage.initOwner(primStage);

        editStage.show();
    }

}
