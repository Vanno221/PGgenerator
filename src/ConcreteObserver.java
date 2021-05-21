import observer.Observer;
import observer.Subject;


public class ConcreteObserver implements Observer {

    public void update(Subject subject){
        System.out.println(subject);
        System.out.println("Press To Add New Item...");
        new java.util.Scanner(System.in).nextLine();
    }
}