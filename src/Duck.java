public  abstract class Duck {
    flyBehaviour flyable;
    quackBehaviour quackable;

    public flyBehaviour getFlyable() {
        return flyable;
    }

    public void setFlyable(flyBehaviour flyable) {
        this.flyable = flyable;
    }

    public quackBehaviour getQuackable() {
        return quackable;
    }

    public void setQuackable(quackBehaviour quackable) {
        this.quackable = quackable;
    }

    public Duck() {}

    public void performFly(){flyable.fly();}
    public void performQuack() {quackable.quack();}

    public abstract void display();

    public void swim() {
        System.out.println("All ducks can swim!!");
    }

}
