public class Main {
    public static void main(String[] args) {
        Car[] car = {
                new Car("car1", 4),
                new Car("car2", 4)
        };

        Truck[] truck = {
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };

        Bicycle[] bicycle = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        Transport[] transports = new Transport[bicycle.length + car.length + truck.length];
        for (int i = 0; i < bicycle.length; i++) {
            transports[i] = bicycle[i];
        }
        for (int i = 0; i < car.length; i++) {
            transports[i + bicycle.length] = car[i];
        }
        for (int i = 0; i < truck.length; i++) {
            transports[i + bicycle.length + car.length] = truck[i];
        }

        ServiceStation station = new ServiceStation();
        station.check(car[0]);
        station.check(bicycle[1]);
        station.check(truck[1]);

    }
}