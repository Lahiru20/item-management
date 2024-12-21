package Controller;

import Database.DBConnection;
import Model.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class ViewItemController {

    DBConnection dbConnection = DBConnection.getInstance();

    public TableColumn col_ItemName;
    public TableColumn col_qty;
    public TableColumn col_price;
    public TableColumn col_ItemID;
    public TableView tbl_Item;
    public ArrayList<Item> dbc = DBConnection.getInstance().getArrayList();

    public void btnReload(ActionEvent actionEvent) {
        ObservableList<Item> customerObservableList = FXCollections.observableArrayList();
        col_ItemID.setCellValueFactory(new PropertyValueFactory<>("ItemID"));
        col_ItemName.setCellValueFactory(new PropertyValueFactory<>("ItemName"));
        col_price.setCellValueFactory(new PropertyValueFactory<>("Price"));
        col_qty.setCellValueFactory(new PropertyValueFactory<>("Qty"));

        dbc.forEach(obj->{
            customerObservableList.add(obj);
        });

        tbl_Item.setItems(customerObservableList);
    }
}
