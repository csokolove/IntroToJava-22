public class Store {
    String productType;
    double price;

    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // write an "advertise" method here! (defining methods slide)
    public void advertise() {
        System.out.println("Come spend some money!");
        System.out.println("We sell " + productType + "!");
    }

    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    public double getPriceWithTax() {
        double totalPrice =  price + price * 0.08;
        return totalPrice;
    }

    public static void main(String[] args) {
        Store pizzaStore = new Store("pizza", 5);

        pizzaStore.advertise();
        pizzaStore.greetCustomer("Charlie");

        double pizzaPrice = pizzaStore.getPriceWithTax();

        System.out.println(pizzaPrice);
    }
}
