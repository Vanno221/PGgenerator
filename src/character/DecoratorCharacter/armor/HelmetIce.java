package character.DecoratorCharacter.armor;
import character.AbstractCharacter;
import character.DecoratorCharacter.EquipmentCharacter;

public class HelmetIce extends EquipmentCharacter {

    private final int armor = 10;

    public HelmetIce (AbstractCharacter character){
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
    
    public String getRace(){
        return super.getRace();
    }
}
