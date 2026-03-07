class Vehicle {

    String ownerName;
    String vehicleType;

    public static int registrationFee = 1000;

    Vehicle(String o, String v) {
        ownerName = o;
        vehicleType = v;
    }

    void displayVehicleDetails() {
        System.out.println("owner name: " + ownerName);
        System.out.println("vehicle type: " + vehicleType);
        System.out.println("registration fee: " + registrationFee);
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Aman", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1500);

        v1.displayVehicleDetails();
    }
}