package pet;

//Implementazione della interfaccia AbstracPet
public class ConcreteHorse implements AbstractPet {
        
    private final int hp = 20;
    private final int speed = 15;
    private final String race = "Horse";

    public int getHP(){
        return this.hp;
    }
    
    public int getSpeed(){
        return this.speed;
    }

    public String getRace(){
        return this.race;
    }

    public int getStat(){
        return this.hp + this.speed;
    }
}
