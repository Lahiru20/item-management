package Controller;

import Database.DBConnection;
import Model.Item;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class AddItemController {



    public TextField txtItemName;
    public TextField txtPrice;
    public TextField txtQty;
    public TextField txtItemID;
    public ArrayList<Item> dbc = DBConnection.getInstance().getArrayList();


    public void btn_AddItem(ActionEvent actionEvent) {
        String itemid = txtItemID.getText();
        String itemname = txtItemName.getText();
        String itemprice = txtPrice.getText();
        String itemqty = txtQty.getText();

        System.out.println(new Item(itemid,itemname,itemprice,itemqty));
        dbc.add(new Item(itemid,itemname,itemprice,itemqty));
        System.out.println(dbc);
    }
}
