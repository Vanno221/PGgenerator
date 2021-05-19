package character.DecoratorCharacter;

import java.util.ArrayList;

import character.AbstractCharacter;
import observer.Subject;

//Creazione del AbstractDecorator
public abstract class EquipmentCharacter extends Subject implements AbstractCharacter {

    protected AbstractCharacter character;

    public EquipmentCharacter(AbstractCharacter character){
        this.character=character;
    }

    public int getHP(){
        return character.getHP();
    }

    public int getAttack(){
        return character.getAttack();
    }

    public int getSpeed(){
        return character.getSpeed();
    }

    public int getArmor(){
        return character.getArmor();
    }

    public int getStat(){
        return character.getStat();
    }

    public String getRace(){
        return character.getRace();
    }

}