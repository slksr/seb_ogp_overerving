public abstract class Car extends Vehicle{

    public Car(int numOfWheels) {
        super(numOfWheels);
    }

    @Override
    public void maintenance() {
        System.out.println("Giving the car some attention....");
    }

    public abstract float fuelling();
}
