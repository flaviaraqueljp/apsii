
public class MallardDuck extends Duck {

    public MallardDuck() {
    	quckBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Sou um pato real (Mallard Duck).");
    }
}