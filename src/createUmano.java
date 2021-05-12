public class createUmano extends PGFactory {

    public PG createCharacter(){
        return new Umano();
    }

    public PG createPet(){
        return new Cavallo();
    }
}