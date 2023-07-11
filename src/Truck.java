public class Truck extends MotorFleet {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void testTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void testFleet() {
        super.testFleet();
        testTrailer();
    }
}
