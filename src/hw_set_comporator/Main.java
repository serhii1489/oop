package hw_set_comporator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Max", 20);
        Person person2 = new Person("Dan", 19);
        Person person3 = new Person("Alex", 22);
        Person person4 = new Person("Rey", 24);
        Person person5 = new Person("Mia", 18);


        Set<Person> personSet0 = new LinkedHashSet();
        personSet0.add(person1);
        personSet0.add(person2);
        personSet0.add(person3);
        personSet0.add(person4);
        personSet0.add(person5);
        System.out.println(personSet0);
        for (Person per: personSet0) {
            System.out.println(per);
        }

        Set<Person> personSet = new TreeSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        System.out.println(personSet);
        for (Person per: personSet) {
            System.out.println(per);
        }


        Set<Person> personSet1 = new HashSet<>();
        personSet1.add(person1);
        personSet1.add(person2);
        personSet1.add(person3);
        personSet1.add(person4);
        personSet1.add(person5);
        System.out.println(personSet1);
        for (Person per: personSet1) {
            System.out.println(per);
        }
    }
}
