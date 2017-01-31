/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controller;

import bikeshop.gui.model.BikeModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ListChangeListener;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author gta1
 */
public class SingleBikeController implements Initializable, ListChangeListener<BikeModel> {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * When the model changes we update the view
     *
     * @param c
     */
    @Override
    public void onChanged(Change<? extends BikeModel> c) {
        System.out.println("Make this work");
    }

}
