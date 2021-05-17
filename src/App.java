public class App {
    public static void main(String[] args) throws Exception {
        PGFactory a = new ConcreteElfFactory();
        System.out.println(a.createCharacter().getHP());
    }
}
