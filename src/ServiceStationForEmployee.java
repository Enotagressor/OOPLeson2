public class ServiceStationForEmployee implements ServiceStation {

    @Override
    public void check(Car[] car){
        for (int i = 0; i < car.length; i++) {
            System.out.println("Обслуживаем " + car[i].getModelName());
            updateTyre();
            checkEngine();
        }
    }
    @Override
    public void check(Truck[] trucks){
        for (int i = 0; i < trucks.length; i++) {
            System.out.println("Обслуживаем " + trucks[i].getModelName());
            updateTyre();
            checkEngine();
            checkTrailer();
        }
    }
    @Override
    public void check(Bicycle[] bicycles){
        for (int i = 0; i < bicycles.length; i++) {
            System.out.println("Обслуживаем " + bicycles[i].getModelName());
            updateTyre();
        }
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
}