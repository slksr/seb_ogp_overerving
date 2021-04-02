public class Vehicle {
    private int numOfWheels;

    public Vehicle (int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void brake() {
        System.out.println(this.getClass().getSimpleName() + " braking with " + numOfWheels + " wheels!");
    }

    public void move() {
        System.out.println(this.getClass().getSimpleName() + " moving with all " + numOfWheels + " wheels!");
    }
}
