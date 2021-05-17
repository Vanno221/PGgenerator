package pet;

//Implementazione della interfaccia AbstracPet
public class ConcreteFairy implements AbstractPet{
    
    private final int hp = 10;
    private final int speed = 25;

    public int getHP(){
        return this.hp;
    }
    
    public int getSpeed(){
        return this.speed;
    }
}
