package character.weapons;

public class Axe extends Equipment{

    private final int attack = 25;

    public Axe (Character character){
        super(character);
    }

    public int getHP(){
        return super.getCharacter().getHP();
    }

    public int getAttack(){
        return super.getCharacter().getAttack() + this.attack;
    }

    public int getSpeed(){
        return super.getCharacter().getSpeed();
    }

    public int getArmor(){
        return super.getCharacter().getArmor();
    }

    public int getStat(){
        return super.getCharacter().getStat() + this.attack;
    }
    
    
}
