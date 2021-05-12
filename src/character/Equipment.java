package character;

public abstract class Equipment implements Character{
    private Character character;

    public Equipment(Character character){
        this.character=character;
    }

    public Character getCharacter(){
        return this.character;
    }
}