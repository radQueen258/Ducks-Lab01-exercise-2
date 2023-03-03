public class MallardDuck extends Duck{
    public MallardDuck() {
        quackable = new yesQuack();
        flyable = new flyWithwings();
    }
        public void display() {
            System.out.println("I am a Mallard Duck");
        }
    }

