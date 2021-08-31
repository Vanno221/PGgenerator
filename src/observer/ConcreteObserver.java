package observer;
public class ConcreteObserver implements Observer {

    public void update(Subject subject){
        
        System.out.println(subject);
        System.out.println("Press To Show Next Character...");
        new java.util.Scanner(System.in).nextLine();
    }
}