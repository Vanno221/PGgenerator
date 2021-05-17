package character.armor;
import character.Character;
import character.DecoratorCharacter.EquipmentCharacter;

public class Leggings extends EquipmentCharacter {

    private final int armor = 15;

    public Leggings (Character character){
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
