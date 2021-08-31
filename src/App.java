import character.DecoratorCharacter.EquipmentCharacter;
import character.DecoratorCharacter.armor.*;
import character.DecoratorCharacter.weapons.*;
import observer.ConcreteObserver;
import pet.AbstractPet;
import character.*;

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
    
    //Istanza del ConcreteObserver e aggiunta del observer
    ConcreteObserver obs = new ConcreteObserver();
    list.attach(obs);
    petlist.attach(obs);

    //Costruzione Equipaggiamento del Character Human tramite decorator    
    EquipmentCharacter equipmentHelmet = new HelmetIce(characterHuman); 

    EquipmentCharacter equipmentChestplace = new ChestplateIce(equipmentHelmet);

    EquipmentCharacter equipmentLegging = new LeggingsIce(equipmentChestplace);

    EquipmentCharacter equipmentBoot = new BootsFire(equipmentLegging) ;

    EquipmentCharacter equipmentFinalHuman = new SwordFire(equipmentBoot);

    list.addCharacter(equipmentFinalHuman);
    petlist.addPet(petHuman);

    //Costruzione Equipaggiamento del Character Elf tramite decorator    
    EquipmentCharacter equipmentHelmet2 = new HelmetIce(characterElf); 

    
    EquipmentCharacter equipmentChestplace2 = new ChestplateIce(equipmentHelmet2);

    EquipmentCharacter equipmentLegging2 = new LeggingsIce(equipmentChestplace2);

    EquipmentCharacter equipmentBoot2 = new BootsFire(equipmentLegging2) ;

    EquipmentCharacter equipmentFinalElf = new SwordFire(equipmentBoot2);

    list.addCharacter(equipmentFinalElf);
    petlist.addPet(petElf); 
   
  }
}
