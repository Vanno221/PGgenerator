import character.DecoratorCharacter.EquipmentCharacter;
import character.DecoratorCharacter.armor.BootsFire;
import character.DecoratorCharacter.armor.BootsIce;
import character.DecoratorCharacter.armor.ChestplateFire;
import character.DecoratorCharacter.armor.ChestplateIce;
import character.DecoratorCharacter.armor.HelmetFire;
import character.DecoratorCharacter.armor.HelmetIce;
import character.DecoratorCharacter.armor.LeggingsFire;
import character.DecoratorCharacter.armor.LeggingsIce;
import character.DecoratorCharacter.weapons.*;
import pet.AbstractPet;
import character.*;
import java.io.*;

public class App {
  public static void main(String[] args) throws Exception {

    //Istanza della famiglia Humam
    PGFactory human = new ConcreteHumanFactory();
    AbstractCharacter characterHuman = human.createCharacter();
    AbstractPet petHuman = human.createPet();

    //Istanza della famiglia Elf
    PGFactory elf = new ConcreteElfFactory();
    AbstractCharacter characterElf = elf.createCharacter();
    AbstractPet petElf = elf.createPet();

    //Creazione Lista Characer
    CharacterList list = CharacterList.getObject();
    PetList petlist = PetList.getObject();
    
    //Isranza del ConcreteObserver e aggiunta del observer
    ConcreteObserver obs = new ConcreteObserver();
    list.attach(obs);
    petlist.attach(obs);

    //Costruzione Equipaggiamento del Character tramite decorator    
    EquipmentCharacter equipmentHelmet = new HelmetIce(characterHuman);
    list.addCharacter(equipmentHelmet); 

    EquipmentCharacter equipmentChestplace = new ChestplateIce(equipmentHelmet);
    list.addCharacter(equipmentChestplace);

    EquipmentCharacter equipmentLegging = new LeggingsIce(equipmentChestplace);
    list.addCharacter(equipmentLegging);

    EquipmentCharacter equipmentBoot = new BootsFire(equipmentLegging) ;
    list.addCharacter(equipmentBoot);

    EquipmentCharacter equipmentFinal = new SwordFire(equipmentBoot);
    list.addCharacter(equipmentFinal);
    
    petlist.addPet(petElf);
  }
}
