public class Car extends Fleet {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        super.testFleet();
    }
}
