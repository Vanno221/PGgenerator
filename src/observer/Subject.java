package observer;
import java.util.*;

public abstract class Subject {

    private ArrayList<Observer> observers;

    public Subject(){
        this.observers = new ArrayList<>();
    }

    public void attach(Observer obs){
        this.observers.add(obs);
    }

    public void detach(Observer obs){
        this.observers.remove(obs);
    }

    public void notifyObservers(){
        for(Observer obs : this.observers){
            obs.update(this);
        }

    }
    
}
