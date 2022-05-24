package hw1_robot;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.canDo();
        RobotDancer robotDancer = new RobotDancer();
        robotDancer.canDo();
        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.canDo();
        Robot[] arrRobot = new Robot[3];
        arrRobot[0] = new CoffeRobot();
        arrRobot[1] = new RobotCoocker();
        arrRobot[2] = new RobotDancer();

        for (int i =0; i< arrRobot.length; i++) {
            System.out.println();
            System.out.println(arrRobot[i].toString());

        }

    }
}
