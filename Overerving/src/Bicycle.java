public class Bicycle extends Vehicle{

    public Bicycle() {
        super(2);
    }

    @Override
    public void maintenance() {
        if (hasFlatTyre()) {
            System.out.println("Fixing the tyre...");
        }
    }

    @Override
    public void brake() {
        //super.brake();
        System.out.println(this.getClass().getName() + " only braking with 1 wheel");
    }

    public boolean hasFlatTyre() {
        return true;
    }
}
