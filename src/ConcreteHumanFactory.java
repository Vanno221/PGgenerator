import character.AbstractCharacter;
import character.ConcreteHuman;
import pet.AbstractPet;
import pet.ConcreteHorse;
 
//Definizione della ConcreteFactory per gli Umani
public class ConcreteHumanFactory implements PGFactory {

    @Override
    public AbstractCharacter createCharacter() {
        return new ConcreteHuman();
    }

    @Override
    public AbstractPet createPet() {
        return new ConcreteHorse();
    }
    
}
