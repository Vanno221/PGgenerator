package character.armor;
import character.Character;
import character.Equipment;

public class Boots extends Equipment {
    private final int armor = 5;
    private final int speed = 15;

    public Boots (Character character){
        super(character);
    }

    public int getHP(){
        return super.getCharacter().getHP();
    }

    public int getAttack(){
        return super.getCharacter().getAttack();
    }

    public int getSpeed(){
        return super.getCharacter().getSpeed() + this.speed;
    }

    public int getArmor(){
        return super.getCharacter().getArmor() + this.armor;
    }

    public int getStat(){
        return super.getCharacter().getStat() + this.armor + this.speed;
    }
}
