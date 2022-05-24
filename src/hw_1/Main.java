package hw_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flover> bouquet = new ArrayList<>();
        bouquet.add(new Rose("red", 3));
        bouquet.add(new Rose("yellow", 3));
        bouquet.add(new Lilia("white", 5));
        bouquet.add(new Chamomile("orange", 4));
        bouquet.add(new Marigold("orange", 2));
        double sumPrise = bouquet.stream().mapToDouble(Flover::getPrice).sum();
        System.out.println(sumPrise);
    }
}
