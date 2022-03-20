package modelsPackage;

public class Item {
    private int id;
    private String name;
    private String brand;
    private String category;
    private int cost;
    private int price;
    private int stockCount;
    private int threshold;
    private boolean beyondThreshold;

    public Item(int id, String name, String brand, String category, int cost, int price, int stockCount, int threshold, boolean beyondThreshold) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.cost = cost;
        this.price = price;
        this.stockCount = stockCount;
        this.threshold = threshold;
        this.beyondThreshold = beyondThreshold;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Item){
            final Item other = (Item) obj;
            if (this.id == other.id)
                return true;
        }
        return false;
    }
    
    
}
