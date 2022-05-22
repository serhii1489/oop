package rect;

import java.util.LinkedList;
import java.util.List;

public class Rectangle {
    private float length;
    private float width;

    public float square(float length, float width){
        float result = length*width;
        System.out.println(result);
        return result;
    }
    public void perimeter(float length, float width){
        float result = (length+width)*2;
        System.out.println(result);
    }
    List list = new LinkedList();
    public Rectangle() {
        length = 3;
        width = 5;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
