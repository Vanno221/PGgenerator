package pet;

//Implementazione della interfaccia AbstracPet
public class ConcreteHorse implements AbstractPet {
        
    private final int hp = 20;
    private final int speed = 15;

    public int getHP(){
        return this.hp;
    }
    
    public int getSpeed(){
        return this.speed;
    }
}
