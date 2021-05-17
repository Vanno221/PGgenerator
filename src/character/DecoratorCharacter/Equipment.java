package character.DecoratorCharacter;

import character.AbstractCharacter;

public abstract class Equipment implements AbstractCharacter{
    private AbstractCharacter character;

    public Equipment(AbstractCharacter character){
        this.character=character;
    }

    public AbstractCharacter getCharacter(){
        return this.character;
    }
}