package character;

public class CharacterBuilder {

    public static Character create(int hp, int attack, int armor, int speed){
        Character a = new ConcreteCharacter();
        return a = new Axe(a);
    }
    
}
