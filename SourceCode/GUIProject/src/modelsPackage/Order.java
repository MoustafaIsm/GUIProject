package modelsPackage;

import java.sql.Date;
import java.util.HashMap;

public class Order {

    private int id;
    private Date dateMade;
    private Date dateArriving;
    private int employeeID;
    private int totalCost;
    private HashMap<Item, Integer> itemsToOrder;

    public Order(int id, Date dateMade, Date dateArriving, int employeeID, int totalCost, HashMap<Item, Integer> itemsToOrder) {
        this.id = id;
        this.dateMade = dateMade;
        this.dateArriving = dateArriving;
        this.employeeID = employeeID;
        this.totalCost = totalCost;
        this.itemsToOrder = itemsToOrder;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Order) {
            final Order other = (Order) obj;
            if (this.id == other.id) {
                return true;
            }
        }

        return false;
    }

}
