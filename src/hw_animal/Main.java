package hw_animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 20, 5);
        animal.getter();
        animal.setter("Frog", 2, 1);
        animal.getter();
        /*animal.setName("Cat");
        animal.setSpeed(10);
        animal.setAge(2);
        System.out.println(animal);*/

    }
}
