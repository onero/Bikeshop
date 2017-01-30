/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controller;

import javafx.scene.Node;
import javafx.scene.control.ListCell;

public class BikeCellController<BikeModel> extends ListCell<BikeModel> {

    private BikeCellViewController controller;

    private Node view;

    /**
     * Set the controller for this ListCell.
     *
     * @param controller
     */
    public void setController(BikeCellViewController controller) {
        this.controller = controller;
    }

    /**
     * Set's the view to display inside this ListCell.
     *
     * @param view
     */
    public void setView(Node view) {
        this.view = view;
    }

}
