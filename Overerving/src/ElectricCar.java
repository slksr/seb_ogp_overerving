public class ElectricCar extends Car{

    public ElectricCar(int numOfWheels) {
        super(numOfWheels);
    }

    public void replaceCord() {
        System.out.println("Car needs a longer powercord... ");
    }

    @Override
    public float fuelling() {
        return 601.99f;
    }
}
