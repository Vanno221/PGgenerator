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

    
    public String toString(){

        String s = "";
       
        //     EquipmentCharacter tmp = this.characters.get(this.characters.size() - 1);

        for(EquipmentCharacter tmp : this.characters){

            // System.out.print("\033[H\033[2J");
            // System.out.flush();

            s += "RIEPILOGO PERSONAGGIO:\n";
            s +=  "\n";
            s += "RAZZA: " + tmp.getRace() + "\n";
            s += "HP: " + tmp.getHP() + "\n";
            s += "SPEED: " + tmp.getSpeed() + "\n";
            s += "ARMOR: " + tmp.getArmor() + "\n";
            s += "ATTACK: " + tmp.getAttack() + "\n \n";
            s += "STAT: " + tmp.getStat() + "\n";
        };
        return s;
    }
    
}
