// 21102121_Mansur Julianto_IF09R
package Unguded;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(2000, "Toyota");
        Mobil mobil = new Mobil();
        mobil.setEngine(engine);

        mobil.start();
        mobil.run();
        mobil.stop();

        Engine mobilEngine = mobil.getEngine();
        System.out.println("Mobil menggunakan mesin dengan cc: " + mobilEngine.getCc() + " dan merk: " + mobilEngine.getMerk());
    }
}
