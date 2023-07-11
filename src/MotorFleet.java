public abstract class MotorFleet extends Fleet {
    public MotorFleet(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void testEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void testFleet() {
        super.testFleet();
        testEngine();
    }
}
