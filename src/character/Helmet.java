package character;

import java.util.ArrayList;

import javax.security.auth.kerberos.KerberosTicket;

public class Helmet extends Equipment {

    private final int stat = 10;
    private final String name ="Diamond Helmet";

    public Helmet (Character character){
        super(character);
    }

    public int getStat(){
        return super.getCharacter().getStat() + this.stat;
    }

    public ArrayList<String> getEquipments(){
        ArrayList<String> equipments = super.getCharacter().get
    }
    
}
