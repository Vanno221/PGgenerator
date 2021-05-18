import character.DecoratorCharacter.armor.Leggings;
import character.DecoratorCharacter.weapons.Sword;
import character.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        PGFactory a = new ConcreteElfFactory();
        PGFactory b = new ConcreteHumanFactory();

        AbstractCharacter c = a.createCharacter();
        
        Sword e = new Sword(c);
        Leggings l = new Leggings(e);


        System.out.println("HP Elf: " + a.createCharacter().getHP());
        System.out.println("HP Fairy: " + a.createPet().getHP());
        
        System.out.println("HP Human: " + b.createCharacter().getHP());
        System.out.println("HP Horse: " + b.createPet().getHP());

        System.out.println("HP sword:" + l.getAttack()+ "" + l.getArmor()); 
        
    }
}
