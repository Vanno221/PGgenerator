package character;

public class ConcreteElf implements AbstractCharacter {

    private final int hp = 15;
    private final int attack = 12;
    private final int speed = 20;
    private final int armor = 10;
    private final String race = "Elf";

    
    public int getHP(){
        return this.hp;
    }

    public int getAttack(){
        return this.attack;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getArmor(){
        return this.armor;
    }

    public int getStat(){
        return this.armor + this.attack + this.hp + this.speed;
    }

    public String getRace(){
        return this.race;
    }

}
