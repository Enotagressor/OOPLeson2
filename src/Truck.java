public class Truck extends Transport implements Service{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        System.out.println(getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkTrailer();
        checkEngine();
    }
}
