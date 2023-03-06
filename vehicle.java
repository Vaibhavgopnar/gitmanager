public class vehicle {
    public static void main(String[] args) {

        PetrolEngin pe = new PetrolEngin();
        pe.start();
        pe.stop();

        DeselEngine de = new DeselEngine();
        de.start();
        de.stop();
        System.out.println("Hello");
    }
}