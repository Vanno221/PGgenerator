package character.DecoratorCharacter.armor;
import character.AbstractCharacter;
import character.DecoratorCharacter.EquipmentCharacter;

public class BootsIce extends EquipmentCharacter {
    private final int armor = 5;
    private final int speed = 15;

    public BootsIce (AbstractCharacter character){
        super(character);
    }

    public int getHP(){
        return super.getHP();
    }

    public int getAttack(){
        return super.getAttack();
    }

    public int getSpeed(){
        return super.getSpeed() + this.speed;
    }

    public int getArmor(){
        return super.getArmor() + this.armor;
    }

    public int getStat(){
        return super.getStat() + this.armor + this.speed;
    }
}
