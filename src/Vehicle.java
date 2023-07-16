public class Vehicle {

    private static Vehicle vehicle = new Vehicle();

    private Vehicle() {
        System.out.println("Bir araç nesnesi oluşturuldu.");
    }

    public static Vehicle getInstance() {
        return vehicle;
    }

}
