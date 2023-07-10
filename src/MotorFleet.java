public class MotorFleet extends Fleet {
    public MotorFleet(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void testEngine() {
        System.out.println("Проверяем двигатель");
    }

}
