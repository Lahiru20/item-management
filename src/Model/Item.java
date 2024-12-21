package Model;

import javafx.scene.control.TextField;

public class Item {
    private String ItemID;
    private String ItemName;
    private String Price;
    private String Qty;

    public Item(String itemID, String itemName, String price, String qty) {
        ItemID = itemID;
        ItemName = itemName;
        Price = price;
        Qty = qty;
    }

    public Item() {

    }

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String itemID) {
        ItemID = itemID;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String qty) {
        Qty = qty;
    }


}
