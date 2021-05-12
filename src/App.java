public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        PGFactory Umano = new createUmano();
        PG a = Umano.createCharacter();
        PG b = Umano.createPet();

        a.create();
        b.create();
    }
}
