package hw2_calculator.second;

import hw2_calculator.first.Numerable;

import java.util.Scanner;

public class MyCalculator implements Numerable {
    Scanner scn = new Scanner(System.in);

    public int a = scn.nextInt();
    public int b = scn.nextInt();
    @Override
    public void divide() {
        int res = a/b;
        System.out.println("divide res ="+res);
    }

    @Override
    public void minus() {
        int res = a-b;
        System.out.println("minus res ="+res);
    }

    @Override
    public void multiply() {
        int res = a*b;
        System.out.println("multiply res ="+res);
    }

    @Override
    public void plus() {
        int res = a+b;
        System.out.println("plus res ="+res);
    }
}
