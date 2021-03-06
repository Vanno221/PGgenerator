import character.AbstractCharacter;
import character.ConcreteElf;
import pet.AbstractPet;
import pet.ConcreteFairy;

//Definizione della ConcreteFactory per gli Elfi
public class ConcreteElfFactory implements PGFactory {

    @Override
    public AbstractCharacter createCharacter() {
        return new ConcreteElf();
    }

    @Override
    public AbstractPet createPet() {
        return new ConcreteFairy();
    }
    
}
