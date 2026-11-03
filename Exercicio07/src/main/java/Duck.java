
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quckBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
    	quckBehavior.quack();
    }

    public void swim() {
        System.out.println("Todos os patos flutuam, até os de borracha!");
    }

    public abstract void display();
}
