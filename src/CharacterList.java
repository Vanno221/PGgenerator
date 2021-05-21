import java.util.ArrayList;

import character.DecoratorCharacter.EquipmentCharacter;
import observer.Subject;

public class CharacterList extends Subject{

    private static CharacterList tmp = null;
    private ArrayList<EquipmentCharacter> characters;

    private CharacterList(){
        characters = new ArrayList<>();
    }

    public static CharacterList getObject(){
        if (tmp == null) {
            tmp = new CharacterList();
        }
        return tmp;
    }

    public void addCharacter(EquipmentCharacter character){
        this.characters.add(character);
        this.notifyObservers();
    }

    public void remove(int index){
        this.characters.remove(index);
        this.notifyObservers();
    }

    public String getAll(){

        String s = "RIEPILOGO PERSONAGGI:\n";

        for(EquipmentCharacter m : this.characters){
            s += m + "\n";
            s += "RAZZA: " + m.getRace() + "\n";
            s += "HP: " + m.getHP() + "\n";
            s += "SPEED: " + m.getSpeed() + "\n";
            s += "ARMOR: " + m.getArmor() + "\n";
            s += "ATTACK: " + m.getAttack() + "\n";
        };
        return s;
    }
    
}
