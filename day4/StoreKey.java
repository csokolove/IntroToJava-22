public class StoreKey {
    String productType;

    public StoreKey(String product) {
        productType = product;
    }

    // write an "advertise" method here! (defining methods slide)

    /*
     * Write a method to print "Come spend some money!" and "Selling productType!" where "productType" is the value of productType.
     */
    public void advertise() {
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }

    public static void main(String[] args) {

    }
}
