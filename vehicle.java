public class vehicle {
    public static void main(String[] args) {

        PetrolEngin pe = new PetrolEngin();
        pe.start();
        pe.stop();

        DeselEngine de = new DeselEngine();
        de.start();
        de.stop();

        ElectricEngine ee = new ElectricEngine();
        ee.start();
        ee.stop();
        ee.makeSound();
        System.out.println("Hello");
    }
}