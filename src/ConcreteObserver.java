import observer.Observer;
import observer.Subject;


public class ConcreteObserver implements Observer {

    public void update(Subject subject){
        System.out.println("Personaggio creato correttamente");
    }
}