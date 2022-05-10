public class Product {
    double cost;
    int quantity;
    String productName; 

    public Product(double cost, int quantity, String productName){
        this.cost = cost;
        this.quantity = quantity;
        this.productName = productName; 

    }

    public String totalCost(){
        return ("Total cost is: " + (quantity * cost));

    }

    public String printProduct(){
        return (productName + " costs " + cost + " and " + quantity + " units were purchased.");

    }

}
