package character.weapons;
import character.Character;
import character.DecoratorCharacter.Equipment;

public class Bow extends Equipment{

    private final int attack = 10;
    private final int speed = 5;

    public Bow (Character character){
        super(character);
    }

    public int getHP(){
        return super.getCharacter().getHP();
    }

    public int getAttack(){
        return super.getCharacter().getAttack() + this.attack;
    }

    public int getSpeed(){
        return super.getCharacter().getSpeed() + this.speed;
    }

    public int getArmor(){
        return super.getCharacter().getArmor();
    }

    public int getStat(){
        return super.getCharacter().getStat() + this.attack + this.speed;
    }
    
    
}
