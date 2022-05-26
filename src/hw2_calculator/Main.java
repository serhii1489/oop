package hw2_calculator;

import hw2_calculator.second.MyCalculator;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
       int a = myCalculator.a;
       int b = myCalculator.b;
       myCalculator.divide();
       myCalculator.plus();
       myCalculator.multiply();
       myCalculator.minus();
    }
}
