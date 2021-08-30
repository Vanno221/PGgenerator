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
    
    //Test parametri Human
    assertEquals(characterHuman.getHP(), 25);
    assertEquals(characterHuman.getAttack(), 12);
    assertEquals(characterHuman.getSpeed(), 20);
    assertEquals(characterHuman.getArmor(), 10);
    assertEquals(characterHuman.getStat(), 67);
    
    //Creazione pet Human
    AbstractPet petHuman = human.createPet();

    //Test parametri Horse
    assertEquals(petHuman.getHP(), 20);
    assertEquals(petHuman.getSpeed(), 15);
    assertEquals(petHuman.getStat(), 35);

    //Costruzione Equipaggiamento del Character Human tramite decorator    
    EquipmentCharacter equipmentHelmet = new HelmetIce(characterHuman); 
    assertEquals(equipmentHelmet.getArmor(), 20);
    assertEquals(equipmentHelmet.getStat(), 77);


    EquipmentCharacter equipmentChestplace = new ChestplateIce(equipmentHelmet);
    assertEquals(equipmentChestplace.getArmor(), 45);
    assertEquals(equipmentChestplace.getStat(), 102);

    EquipmentCharacter equipmentLegging = new LeggingsIce(equipmentChestplace);
    assertEquals(equipmentLegging.getArmor(), 60);
    assertEquals(equipmentLegging.getStat(), 117);

    EquipmentCharacter equipmentBoot = new BootsFire(equipmentLegging);
    assertEquals(equipmentBoot.getArmor(), 60);
    assertEquals(equipmentBoot.getSpeed(), 30);
    assertEquals(equipmentBoot.getStat(), 134);

    EquipmentCharacter equipmentFinalHuman = new SwordFire(equipmentBoot);

    assertEquals(equipmentFinalHuman.getStat(), 149);       
        
    }
}
    