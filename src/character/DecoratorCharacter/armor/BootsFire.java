package character.DecoratorCharacter.armor;
import character.AbstractCharacter;
import character.DecoratorCharacter.EquipmentCharacter;

public class BootsFire extends EquipmentCharacter {
    private final int attack = 7;
    private final int speed = 10;

    public BootsFire (AbstractCharacter character){
        super(character);
    }

    public int getHP(){
        return super.getHP();
    }

    public int getAttack(){
        return super.getAttack() + this.attack;
    }

    public int getSpeed(){
        return super.getSpeed() + this.speed;
    }

    public int getArmor(){
        return super.getArmor();
    }

    public int getStat(){
        return super.getStat() + this.attack + this.speed;
    }
}
