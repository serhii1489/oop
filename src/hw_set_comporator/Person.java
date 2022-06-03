package hw_set_comporator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age-p.age;
        /*if (p.age > this.age) {
            return -1;
        } else if (p.age < this.age) {
            return 1;
        } else return 0;*/
    }
}
