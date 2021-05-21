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
    
    //Isranza del ConcreteObserver e aggiunta del observer
    ConcreteObserver obs = new ConcreteObserver();
    list.attach(obs);

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
    /*
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("|   MENU CREAZIONE PERSONAGGIO   |");
    System.out.println("|                                |");
    System.out.println("|        1. ELFO                 |");
    System.out.println("|        2. UMANO                |");
    System.out.println("|        3. EXIT                 |");

    System.out.print("Enter Options: ");

    BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(buffReader.readLine());

    switch (input) {

      case 1:
        PGFactory a = new ConcreteElfFactory();
        character = a.createCharacter();
        pet = a.createPet();
        break;

      case 2:
        PGFactory d = new ConcreteHumanFactory();
        character = d.createCharacter();
        pet = d.createPet();
        break;

      default:
        System.out.println("Invalid selection");
    }

    // CREAZIONE ELMO
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("|       SELEZIONA ELMO              |");
    System.out.println("|                                   |");
    System.out.println("|      1. ELMO DI FUOCO             |");
    System.out.println("|      2. ELMO DI GHIACCIO          |");

    System.out.print("Enter Options: ");
    buffReader = new BufferedReader(new InputStreamReader(System.in));
    input = Integer.parseInt(buffReader.readLine());

    switch (input) {
      case 1:
        equipmentHelmet = new HelmetFire(character);
        break;

      case 2:
        equipmentHelmet = new HelmetIce(character);
        break;

      default:
        System.out.println("Invalid selection");
    }

    // CREAZIONE CORPETTO
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("|           SELEZIONA CORPETTO          |");
    System.out.println("|                                       |");
    System.out.println("|        1. CORPETTO DI FUOCO           |");
    System.out.println("|        2. CORPETTO DI GHIACCIO        |");

    System.out.print("Enter Options: ");
    buffReader = new BufferedReader(new InputStreamReader(System.in));
    input = Integer.parseInt(buffReader.readLine());

    switch (input) {
      case 1:
        equipmentChestplace = new ChestplateFire(equipmentHelmet);        
        break;
      case 2:
        equipmentChestplace = new ChestplateIce(equipmentHelmet);
        break;
      default:
        System.out.println("Invalid selection");
    }

    // CREAZIONE GAMBALI
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("|          SELEZIONA GAMBALI           |");
    System.out.println("|                                      |");
    System.out.println("|        1. GAMBALI DI FUOCO           |");
    System.out.println("|        2. GAMBALI DI GHIACCIO        |");

    System.out.print("Enter Options: ");
    buffReader = new BufferedReader(new InputStreamReader(System.in));
    input = Integer.parseInt(buffReader.readLine());

    switch (input) {

      case 1:
        equipmentLegging = new LeggingsFire(equipmentChestplace);
        break;

      case 2:
        equipmentLegging = new LeggingsIce(equipmentChestplace);
        break;

      default:
        System.out.println("Invalid selection");
    }

    // CREAZIONE STIVALI
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("|           SELEZIONA STIVALI             |");
    System.out.println("|                                         |");
    System.out.println("|        1. STIVALI DI FUOCO              |");
    System.out.println("|        2. STIVALI DI GHIACCIO           |");

    System.out.print("Enter Options: ");
    buffReader = new BufferedReader(new InputStreamReader(System.in));
    input = Integer.parseInt(buffReader.readLine());

    switch (input) {
      case 1:
        equipmentBoot = new BootsFire(equipmentLegging);
        break;
      case 2:
        equipmentBoot = new BootsIce(equipmentLegging);
        break;
      default:
        System.out.println("Invalid selection");
    }

    // CREAZIONE ARMA
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("|         SELEZIONA ARMA         |");
    System.out.println("|                                |");
    System.out.println("|        1. SPADA DI GHIACCIO    |");
    System.out.println("|        2. SPADA DI FUOCO       |");
    System.out.println("|        3. ASCIA DI GHIACCIO    |");
    System.out.println("|        4. ASCIA DI FUOCO       |");

    System.out.print("Enter Options: ");
    buffReader = new BufferedReader(new InputStreamReader(System.in));
    input = Integer.parseInt(buffReader.readLine());

    switch (input) {
      case 1:
        equipmentFinal = new SwordIce(equipmentBoot);
        break;

      case 2:
        equipmentFinal = new SwordFire(equipmentBoot);
        break;

      case 3:
        equipmentFinal = new AxeIce(equipmentBoot);
        break;

      case 4:
        equipmentFinal = new AxeFire(equipmentBoot);
        break;

      default:
        System.out.println("Invalid selection");

    }
    System.out.print("\033[H\033[2J");
    System.out.flush();
    list.addCharacter(equipmentFinal);
    list.getAll();
    System.out.println("         RIEPILOGO PERSONAGGIO         ");
    System.out.println(" RAZZA: "+ equipmentFinal.getRace());
    System.out.println(" HP: "+ equipmentFinal.getHP());
    System.out.println(" ARMOR: "+ equipmentFinal.getArmor());
    System.out.println(" ATTACK: "+ equipmentFinal.getAttack());
    System.out.println(" SPEED: "+ equipmentFinal.getSpeed());
    System.out.println("");
    System.out.println(" STAT: "+ equipmentFinal.getStat());

    System.out.println("");
    System.out.println("         RIEPILOGO PET         ");
    System.out.println(" PET RACE: "+ pet.getRace());
    System.out.println(" PET HP: "+ pet.getHP());
    System.out.println(" PET SPEED: "+ pet.getSpeed());
    */
  }
}
