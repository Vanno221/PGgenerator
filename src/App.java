public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        PGFactory a = new ConcreteElfFactory();
        System.out.println(a.createCharacter().getHP());
    }
}
