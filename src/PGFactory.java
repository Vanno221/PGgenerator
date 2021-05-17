import character.AbstractCharacter;
import pet.AbstractPet;

public interface PGFactory {
    public abstract AbstractCharacter createCharacter();
    public abstract AbstractPet createPet();
}
