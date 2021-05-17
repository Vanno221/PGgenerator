import pet.ConcreteFairy;

public class App {
    public static void main(String[] args) throws Exception {
        
        PGFactory a = new ConcreteElfFactory();
        PGFactory b = new ConcreteHumanFactory();

        System.out.println("HP Elf: " + a.createCharacter().getHP());
        System.out.println("HP Fairy: " + a.createPet().getHP());
        
        System.out.println("HP Human: " + b.createCharacter().getHP());
        System.out.println("HP Horse: " + b.createPet().getHP());

    }
}
