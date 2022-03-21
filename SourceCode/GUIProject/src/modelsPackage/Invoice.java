package modelsPackage;

import java.sql.Date;
import java.util.HashMap;

public class Invoice {
    private int id;
    private Date dateSold;
    private int totalPrice;
    private int employeeID;
    private HashMap<Item, Integer> itemsToSell;

    public Invoice(int id, Date dateSold, int totalPrice, int employeeID, HashMap<Item, Integer> itemsToSell) {
        this.id = id;
        this.dateSold = dateSold;
        this.totalPrice = totalPrice;
        this.employeeID = employeeID;
        this.itemsToSell = itemsToSell;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Invoice){
            final Invoice other = (Invoice) obj;
            if (this.id == other.id)
                return true;
        }
        return false;
    }

}