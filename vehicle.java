public class vehicle {

    int tyres ;
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

        HydrogenEngine he = new HydrogenEngine();
        he.start();
        he.stop();
        System.out.println("Hello");

        this.tyres = 4;
    }
}