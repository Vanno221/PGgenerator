package character.DecoratorCharacter.armor;
import character.AbstractCharacter;
import character.DecoratorCharacter.EquipmentCharacter;

public class HelmetFire extends EquipmentCharacter {

    private final int armor = 10;

    public HelmetFire (AbstractCharacter character){
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
