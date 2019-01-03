package Task3.Robot;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotCoocker robotCoocker = new RobotCoocker();
        RobotDancer robotDancer = new RobotDancer();
        robot.work();
        coffeRobot.work();
        robotCoocker.work();
        robotDancer.work();
        System.out.println();

       Robot[] robots = {new CoffeRobot(), new RobotCoocker(), new RobotDancer(),
               new CoffeRobot(), new RobotCoocker(), new RobotDancer(),
               new CoffeRobot(), new RobotCoocker(), new RobotDancer()};

        for (Robot robot1 : robots) {
            robot1.work();
        }
    }
}
