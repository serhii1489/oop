package hw2_calculator;

import hw2_calculator.second.MyCalculator;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println("write number a:");
       int a = myCalculator.a;
        System.out.println("write number b:");
       int b = myCalculator.b;
       myCalculator.divide();
       myCalculator.plus();
       myCalculator.multiply();
       myCalculator.minus();
    }
}
