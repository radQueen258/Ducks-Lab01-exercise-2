public class muteQuack implements quackBehaviour{
    @Override
    public void quack() {
        System.out.println("......well, I am not supposed to say anything you know");
    }
}
