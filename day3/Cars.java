public class Cars {
    String carMake;
    String carModel;
    int numberOfWheels;
    int numberOfSeats;
    boolean hasBluetooth;

    public Cars(String carMake, String carModel, int numberOfWheels, int numberOfSeats, boolean hasBluetooth) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.numberOfWheels = numberOfWheels;
        this.numberOfSeats = numberOfSeats;
        this.hasBluetooth = hasBluetooth;
    }

    public static void main(String[] args) {
        Cars toyotaHilux = new Cars("Toyota", "Hilux", 4, 7, true);
        Cars fordFusion = new Cars("Ford", "Fusion", 4, 5, true);
        Cars acuraMDX = new Cars("Acura", "MDX", 4, 7, true);
    
        System.out.println(toyotaHilux.carMake);
    }
}
