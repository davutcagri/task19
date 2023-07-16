public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = Vehicle.getInstance();
        Vehicle vehicle2 = Vehicle.getInstance();

        if(vehicle1 == vehicle2) {
            System.out.println("Nesneler aynı");
        }
        else {
            System.out.println("Nesneler farklı");
        }
    }
}