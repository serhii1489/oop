package hw1_with_car;

public class Wheel {
    private String wheelFirm;
    private int wheelQuantity;

    @Override
    public String toString() {
        return "Wheel{" +
                "wheel Firm is' " + wheelFirm + '\'' +
                ", wheelQuantity=" + wheelQuantity +
                '}';
    }

    public void addCoupleWheel(int wheelQuantity){
        int newQuantityWheel = wheelQuantity+2;
        System.out.println("now quantity of wheel is: "+newQuantityWheel);
    }

    public String getWheelFirm() {
        return wheelFirm;
    }

    public void setWheelFirm(String wheelFirm) {
        this.wheelFirm = wheelFirm;
    }

    public int getWheelQuantity() {
        return wheelQuantity;
    }

    public void setWheelQuantity(int wheelQuantity) {
        this.wheelQuantity = wheelQuantity;
    }

    public Wheel(String wheelFirm, int wheelQuantity) {
        this.wheelFirm = wheelFirm;
        this.wheelQuantity = wheelQuantity;
    }
}
