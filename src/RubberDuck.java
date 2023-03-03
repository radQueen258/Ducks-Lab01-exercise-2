public class RubberDuck extends Duck {
    public RubberDuck() {
        quackable = new Squeak();
        flyable = new flyNoway();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck!!");
    }
}
