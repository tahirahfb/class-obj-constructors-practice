public class MainProduct {
    public static void main(String[] args){
        Product gas = new Product(4.0, 10, "Gallons of Gas");

        System.out.println(gas.printProduct());
        System.out.println(gas.totalCost());
    }
}
