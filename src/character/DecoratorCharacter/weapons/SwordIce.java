package character.DecoratorCharacter.weapons;

import character.AbstractCharacter;
import character.DecoratorCharacter.EquipmentCharacter;

public class SwordIce extends EquipmentCharacter{

    private final int attack = 15;

    public SwordIce (AbstractCharacter character){
        super(character);
    }

    public int getHP(){
        return super.getHP();
    }

    public int getAttack(){
        return super.getAttack() + this.attack;
    }

    public int getSpeed(){
        return super.getSpeed();
    }

    public int getArmor(){
        return super.getArmor();
    }
    
    public int getStat(){
        return super.getStat() + this.attack;
    }
    
    public String getRace(){
        return super.getRace();
    }

}
