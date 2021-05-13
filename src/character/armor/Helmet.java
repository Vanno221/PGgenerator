package character.armor;

import java.util.ArrayList;

import javax.security.auth.kerberos.KerberosTicket;

import character.Character;
import character.Equipment;

public class Helmet extends Equipment {

    private final int stat = 10;
    private final String name ="Diamond Helmet";

    public Helmet (Character character){
        super(character);
    }

    //public int getStat(){
    //    return super.getCharacter().getStat() + this.stat;
    //}

    public int getArmor(){
        return super.getCharacter().getArmor() + this.stat;
    }

    public int getHP(){
        return this.
    }

    public ArrayList<String> getEquipments(){
        ArrayList<String> equipments = super.getCharacter().getEquipments();
        equipments.add(this.name);
        return equipments;
    }
    
}
