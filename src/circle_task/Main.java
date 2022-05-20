package circle_task;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.square(circle.getRadius());
        circle.length(circle.getDiameter());
    }
}
