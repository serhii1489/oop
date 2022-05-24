package hw1_with_car;

public class Car {
    private String name;
    private int price;
    private Helm helm;
    private Wheel wheel;
    private Body body;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", helm=" + helm +
                ", wheel=" + wheel +
                ", body=" + body +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void surprisePrice(int price){
        int newPrice = price - 100;
        System.out.println("surprise? new price is: "+newPrice);
    }

    public Car(String name, int price, Helm helm, Wheel wheel, Body body) {
        this.name = name;
        this.price = price;
        this.helm = helm;
        this.wheel = wheel;
        this.body = body;
    }
}
