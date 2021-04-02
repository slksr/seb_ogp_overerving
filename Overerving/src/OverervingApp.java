public class OverervingApp {

    public static void main(String[] args) {
        //Waarom breekt de code als de code uit commentaar wordt gehaald?
        /*
        Vehicle vehicle = new Vehicle(8);
        Car car = new Car(4);
        */
        Bicycle bike = new Bicycle();
        ElectricCar eCar = new ElectricCar(3);
        PetrolCar pCar = new PetrolCar(4);
        // Directe aanroep
        eCar.move();
        pCar.move();
        bike.brake();
        System.out.println("Running flat... " + bike.hasFlatTyre());
        System.out.println("============================================");
        // Gebruik de basis classes
        Vehicle[] vehicles = new Vehicle[] {eCar, pCar, bike};
        for (Vehicle v : vehicles) {
            v.move();
            v.brake();
            // Verklaar woorom de hasFlatTyre niet direct beschikbaar is?
            if (v instanceof Bicycle) {
                // Casting
                System.out.println("CAST => Running flat... " + ((Bicycle)v).hasFlatTyre());
            }
            v.maintenance();
            if (v instanceof Car) {
                String text = "Filled up with ";
                // Casting
                float power = ((Car)v).fuelling();
                System.out.println( text + power + ((v instanceof PetrolCar) ? " liter E10 petrol..." : (v instanceof ElectricCar) ? " KWH electric juice!" : " something!"));
            }

            if (v instanceof ElectricCar) {
                // Casting
                ((ElectricCar)v).replaceCord();
            }
            System.out.println("============================================");
        }
    }
}
