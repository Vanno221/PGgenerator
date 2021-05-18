package character.DecoratorCharacter.armor;

import character.AbstractCharacter;
import character.DecoratorCharacter.EquipmentCharacter;

public class Leggings extends EquipmentCharacter {

    private final int armor = 15;

    public Leggings (AbstractCharacter character){
        super(character);
    }

    public int getHP(){
        return super.getHP();
    }

    public int getAttack(){
        return super.getAttack();
    }

    public int getSpeed(){
        return super.getSpeed();
    }

    public int getArmor(){
        return super.getArmor() + this.armor;
    }

    public int getStat(){
        return super.getStat() + this.armor;
    }
    
}
