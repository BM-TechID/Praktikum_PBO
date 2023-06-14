// 21102121_Mansur Julianto_IF09R
package Unguded;

public class Mobil {
    private int status;
    private Engine mesin;

    public void setEngine(Engine engine) {
        this.mesin = engine;
    }

    public void start() {
        System.out.println("Mobil dinyalakan");
        mesin.on();
    }

    public void run() {
        System.out.println("Mobil sedang berjalan");
    }

    public void stop() {
        System.out.println("Mobil berhenti");
        mesin.off();
    }

    public Engine getEngine() {
        return mesin;
    }
}
