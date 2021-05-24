import java.util.ArrayList;

import character.DecoratorCharacter.EquipmentCharacter;
import observer.Subject;
import pet.AbstractPet;

public class PetList extends Subject{

    private static PetList tmp = null;
    private ArrayList<AbstractPet> pets;

    private PetList(){
        pets = new ArrayList<>();
    }

    public static PetList getObject(){
        if (tmp == null) {
            tmp = new PetList();
        }
        return tmp;
    }

    public void addPet(AbstractPet pet){
        this.pets.add(pet);
        this.notifyObservers();
    }

    public void remove(int index){
        this.pets.remove(index);
        this.notifyObservers();
    }

    public String toString(){

        String s = null;

        for(AbstractPet tmp: this.pets){

            //System.out.print("\033[H\033[2J");
            //System.out.flush();
            s = "RIEPILOGO PET:\n";
            s +=  "\n";
            s += "RAZZA: " + tmp.getRace() + "\n";
            s += "HP: " + tmp.getHP() + "\n";
            s += "SPEED: " + tmp.getSpeed() + "\n";

        };
        return s;
    }
    
}
