package hw_animal;

public class Animal {
    private String name;
    private int speed;
    private int age;

    @Override
    public String toString() {
        return "Animal{" +
                "Animal name is =" + name + '\'' +
                ", animal speed =" + speed +
                ", animal age=" + age +
                "years'}'";
    }

    public void setter(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public void getter() {
        System.out.println("Animal name =" + name + ", animal speed =" + speed + ", animal age = " + age);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }
}
