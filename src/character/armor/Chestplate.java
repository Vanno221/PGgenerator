package character.armor;
import character.Character;
import character.Equipment;

public class Chestplate extends Equipment {

    private final int armor = 25;

    public Chestplate (Character character){
        super(character);
    }

    public int getHP(){
        return super.getCharacter().getHP();
    }

    public int getAttack(){
        return super.getCharacter().getAttack();
    }

    public int getSpeed(){
        return super.getCharacter().getSpeed();
    }

    public int getArmor(){
        return super.getCharacter().getArmor() + this.armor;
    }

    public int getStat(){
        return super.getCharacter().getStat() + this.armor;
    }
    
}
