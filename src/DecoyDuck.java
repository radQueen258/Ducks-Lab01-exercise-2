public class DecoyDuck extends Duck{

    public DecoyDuck () {
        quackable = new muteQuack();
        flyable = new flyWithwings();
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy Duck!");
    }
}
