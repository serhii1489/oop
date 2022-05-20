package rect;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.getLength());
        rectangle1.square(rectangle1.getLength(), rectangle1.getWidth());
    }
}
