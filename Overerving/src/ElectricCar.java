public class ElectricCar extends Car{

    public ElectricCar(int numOfWheels) {
        super(numOfWheels);
    }

    @Override
    public void maintenance() {
        super.maintenance();
        System.out.println("controleer de accu's");
    }

    public void replaceCord() {
        System.out.println("Car needs a longer powercord... ");
    }

    @Override
    public float fuelling() {
        return 601.99f;
    }
}
