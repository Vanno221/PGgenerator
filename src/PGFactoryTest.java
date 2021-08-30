import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import character.DecoratorCharacter.EquipmentCharacter;
import character.DecoratorCharacter.armor.*;
import character.DecoratorCharacter.weapons.*;
import pet.AbstractPet;
import character.*;
    
public class PGFactoryTest {

        
    @Test
    public void test() {

    //Istanza della famiglia Humam
    PGFactory human = new ConcreteHumanFactory();
    AbstractCharacter characterHuman = human.createCharacter();
    AbstractPet petHuman = human.createPet();


    //Creazione Lista Characer
    CharacterList list = CharacterList.getObject();
    PetList petlist = PetList.getObject();

    //Costruzione Equipaggiamento del Character Human tramite decorator    
    EquipmentCharacter equipmentHelmet = new HelmetIce(characterHuman); 

    EquipmentCharacter equipmentChestplace = new ChestplateIce(equipmentHelmet);

    EquipmentCharacter equipmentLegging = new LeggingsIce(equipmentChestplace);

    EquipmentCharacter equipmentBoot = new BootsFire(equipmentLegging) ;

    EquipmentCharacter equipmentFinalHuman = new SwordFire(equipmentBoot);

    list.addCharacter(equipmentFinalHuman);
    petlist.addPet(petHuman);

    assertEquals(equipmentFinalHuman.getStat(), 149);
    
    
        
    }
}
    