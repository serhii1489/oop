package hw1_with_car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 7000, new Helm("toyo HAlm", 220),
                new Wheel("rosava", 19), new Body("coup", 4350));

        car1.getHelm().multiplicationDiameter(car1.getHelm().getHelmDiameter());
        car1.surprisePrice(car1.getPrice());
        System.out.println(car1);

        Car car2 = new Car("Honda", 9000, new Helm("honda sport halm", 200),
                new Wheel("michelin", 21), new Body("sport-coup", 2350));
    }
}
