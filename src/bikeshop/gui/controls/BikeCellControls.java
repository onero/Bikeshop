/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikeshop.gui.controls;

import bikeshop.gui.controller.BikeCellViewController;
import javafx.scene.Node;
import javafx.scene.control.ListCell;

public class BikeCellControls<BikeModel> extends ListCell<BikeModel> {

    private BikeCellViewController mController;

    private Node mView;

    /**
     * Updates the list cell to its newly set item. This is where the magic
     * happens.
     *
     * @param item The item to display
     * @param empty Wether or not the cell is empty.
     */
    @Override
    protected void updateItem(BikeModel item, boolean empty) {
        super.updateItem(item, empty);
        if (empty) {
            setGraphic(null); //If this ListCell should be displayed as an ampty one.
        } else {
            mController.setBikeModel((bikeshop.be.BikeProperty) item); //We assign a new BikeModel to display in this cell.
            setGraphic(mView); // Update the graphics.
        }
    }

    /**
     * Set the controller for this ListCell.
     *
     * @param controller
     */
    public void setController(BikeCellViewController controller) {
        mController = controller;
    }

    /**
     * Set's the view to display inside this ListCell.
     *
     * @param view
     */
    public void setView(Node view) {
        mView = view;
    }

}
