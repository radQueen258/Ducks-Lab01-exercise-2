public class RedHeadDuck extends Duck{

     public RedHeadDuck() {
         quackable = new yesQuack();
         flyable = new flyWithwings();
     }

    @Override
    public void display() {
        System.out.println("I am a RedHead Duck!!");
    }
}
