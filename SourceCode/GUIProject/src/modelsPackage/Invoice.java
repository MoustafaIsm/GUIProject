package modelsPackage;

import java.sql.Date;
import java.util.ArrayList;

public class Invoice {
    private int id;
    private Date dateSold;
    private int totalPrice;
    private int employeeID;
    private ArrayList<Item> itemsToSell;
    private ArrayList<Integer> itemsCount;

    public Invoice(int id, Date dateSold, int totalPrice, int employeeID, ArrayList<Item> itemsToSell, ArrayList<Integer> itemsCount) {
        this.id = id;
        this.dateSold = dateSold;
        this.totalPrice = totalPrice;
        this.employeeID = employeeID;
        this.itemsToSell = itemsToSell;
        this.itemsCount = itemsCount;
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