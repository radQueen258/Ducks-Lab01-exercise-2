public class duckMain {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.display();
        rubberDuck.swim();

        System.out.println();

        Duck redHead = new RedHeadDuck();
        redHead.performQuack();
        redHead.performFly();
        redHead.display();
        redHead.swim();

        System.out.println();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.performQuack();
        decoyDuck.performFly();
        decoyDuck.display();
        decoyDuck.swim();

        System.out.println();

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.display();
        mallardDuck.swim();
    }
}
