import character.AbstractCharacter;
import pet.AbstractPet;

//Definizione della AbstractFactory
public interface PGFactory {
    public abstract AbstractCharacter createCharacter();
    public abstract AbstractPet createPet();
}
