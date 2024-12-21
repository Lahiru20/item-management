package Database;

import Model.Item;

import java.util.ArrayList;

public class DBConnection{



private static DBConnection instance;

    ArrayList<Item> ItemArrayList;


    private DBConnection() {
        ItemArrayList = new ArrayList<>();
    }

public static DBConnection getInstance() {
    if (instance == null) {
        instance = new DBConnection();
    }
    return instance;
}

public ArrayList<Item> getArrayList(){
     return ItemArrayList;
}
}
