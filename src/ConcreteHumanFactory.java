import character.ConcreteDrago;

public class DragoFactory extends PGFactory {

    @Override
    public Character createCharacter() {
        return new ConcreteDrago();
    }

    @Override
    public Pet createPet() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
