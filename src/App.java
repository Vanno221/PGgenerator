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

    AbstractCharacter character = null;
    AbstractPet pet = null;
    EquipmentCharacter equipment = null;

    System.out.println("|                   MENU                   |");
    System.out.println("|                                          |");
    System.out.println("|        1. CREAZIONE PERSONAGGIO          |");
    System.out.println("|        2. CANCELLA PERSONAGGIO           |");
    System.out.println("|        3. STAMPA LISTA PERSONA           |");
    System.out.println("|        4. EXIT                           |");

    System.out.print("Enter Options: ");

    BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(buffReader.readLine());

    // Switch construct
    switch (input) {
      case 1:
        System.out.println("|   MENU CREAZIONE PERSONAGGIO     |");
        System.out.println("|                                  |");
        System.out.println("|        1. ELFO                   |");
        System.out.println("|        2. UMANO                  |");
        System.out.println("|        3. EXIT                   |");

        System.out.print("Enter Options: ");
        buffReader = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(buffReader.readLine());

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

          default:  System.out.println("Invalid selection");
        }

        // CREAZIONE ELMO
        System.out.println("|        QUALE ELMO?      |");
        System.out.println("|                         |");
        System.out.println("|      1. FUOCO           |");
        System.out.println("|      2. GHIACCIO        |");

        System.out.print("Enter Options: ");
        buffReader = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(buffReader.readLine());

        switch (input) {
          case 1:
            equipment = new HelmetFire(character);
            break;
          case 2:
            equipment = new HelmetIce(character);
            break;
          default:  System.out.println("Invalid selection");
          }

        // CREAZIONE CORPETTO
        System.out.println("|       QUALE CORPETTO?     |");
        System.out.println("|                           |");
        System.out.println("|        1. FUOCO           |");
        System.out.println("|        2. GHIACCIO        |");
        
        System.out.print("Enter Options: ");
        buffReader = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(buffReader.readLine());

        switch (input) {
          case 1:
            equipment = new ChestplateFire(character);
            break;
          case 2:
            equipment = new ChestplateIce(character);
            break;
          default:  System.out.println("Invalid selection");
          }

        // CREAZIONE GAMBALI
        System.out.println("|       QUALE GAMBALI?      |");
        System.out.println("|                           |");
        System.out.println("|        1. FUOCO           |");
        System.out.println("|        2. GHIACCIO        |");
        
        System.out.print("Enter Options: ");
        buffReader = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(buffReader.readLine());

        switch (input) {
          case 1:
            equipment = new LeggingsFire(character);
            break;
          case 2:
            equipment = new LeggingsIce(character);
            break;
          default:  System.out.println("Invalid selection");
          }

        // CREAZIONE STIVALI
        System.out.println("|       QUALI STIVALI?      |");
        System.out.println("|                           |");
        System.out.println("|        1. FUOCO           |");
        System.out.println("|        2. GHIACCIO        |");
        
        System.out.print("Enter Options: ");
        buffReader = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(buffReader.readLine());

        switch (input) {
          case 1:
            equipment = new BootsFire(character);
            break;
          case 2:
            equipment = new BootsIce(character);
            break;
          default:  System.out.println("Invalid selection");
        }

        // CREAZIONE ARMA
        System.out.println("|         QUALE ARMA?            |");
        System.out.println("|                                |");
        System.out.println("|        1. SPADA DI GHIACCIO    |");
        System.out.println("|        2. SPADA DI FUOCO       |");
        System.out.println("|        2. ASCIA DI GHIACCIO    |");
        System.out.println("|        2. ASCIA DI FUOCO       |");

        System.out.print("Enter Options: ");
        buffReader = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(buffReader.readLine());
        
        switch (input) {
          case 1:
            equipment = new SwordIce(character);
            break;

          case 2:
            equipment = new SwordFire(character);
            break;

          case 3:
            equipment = new AxeIce(character);
            break;

          case 4:
            equipment = new AxeFire(character);
            break;

          default:  System.out.println("Invalid selection");

        }
        break;

      case 2:
        System.out.println("Option 2 selected");
        break;

      case 3:
        System.out.println("Exit selected");
        break;

      default:
        System.out.println("Invalid selection");
    }

  }
}
