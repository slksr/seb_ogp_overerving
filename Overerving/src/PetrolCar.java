public class PetrolCar extends Car{

    public PetrolCar(int numOfWheels) {
        super(numOfWheels);
    }

    @Override
    public float fuelling() {
        return 50.5f;
    }
}
