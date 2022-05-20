package circle_task;

import java.util.Scanner;

public class Circle {
    Scanner scn = new Scanner(System.in);
    private float radius = scn.nextFloat();
    private float diameter = scn.nextFloat();

    public Circle() {

    }
    public void length(float diameter){
        float res = (float) 3.14*diameter;
        System.out.println(res);
    }
    public void square(float radius) {
        float res = (float) (2 * 3.14 * (radius * radius));
        System.out.println(res);
    }



    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }


    public Circle(float radius, float perimeter) {
        this.radius = radius;
        this.diameter = perimeter;
    }
}
