package Controller;

import Database.DBConnection;
import Model.Item;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Objects;


public class RemoveItemController{

    public TextField txtItemID;
    public Button txtSearch;
    public Label lblName;
    public Label lblqty;
    public Label lblPrice;
    public AnchorPane btn_Search;
    public ArrayList<Item> dbc = DBConnection.getInstance().getArrayList();


    public void btn_Remove(ActionEvent actionEvent) {
        dbc.forEach(obj ->{
            if(obj.getItemID().equals(txtItemID.getText())) {
                lblName.setText(obj.getItemName());
                lblqty.setText(obj.getQty());
                lblPrice.setText(obj.getPrice());
                dbc.remove(obj);
            }
        });
    }

    public void btnSearch(ActionEvent actionEvent) throws InterruptedException {
        dbc.forEach(obj ->{
            if(obj.getItemID().equals(txtItemID.getText())){
                lblName.setText(obj.getItemName());
                lblqty.setText(obj.getQty());
                lblPrice.setText(obj.getPrice());
            }
        });
        if(Objects.equals(lblName.getText(), "")){
            txtItemID.setText("Item not Found");
        }
    }
}
