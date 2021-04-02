public class OverervingApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(8);
        Car car = new Car(4);
        Bicycle bike = new Bicycle();


        vehicle.move();
        car.move();
        bike.brake();
        System.out.println("Running flat... " + bike.hasFlatTyre());

        System.out.println();

        Vehicle[] vehicles = new Vehicle[] {vehicle, car, bike};
        for (Vehicle v : vehicles) {
            v.move();
            v.brake();
            // Verklaar woorom de hasFlatTyre niet direct beschikbaar is?
            if (v instanceof Bicycle) {
                // Casting
                System.out.println("CAST => Running flat... " + ((Bicycle)v).hasFlatTyre());
            }
        }
    }
}
