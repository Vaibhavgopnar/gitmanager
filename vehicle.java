public class vehicle {
    public static void main(String[] args) {

        PetrolEngin pe = new PetrolEngin();
        pe.start();

        DeselEngine de = new DeselEngine();
        de.start();
        System.out.println("Hello");
    }
}