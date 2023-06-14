package Test;

// 21102121_Mansur Julianto_IF09R

class Mobil {
    private int status;
    private Engine mesin;

    public Mobil() {
        this.mesin = new Engine();
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
}

class Engine {
    private int cc;
    private String merk;

    public void on() {
        System.out.println("Mesin dinyalakan");
    }

    public void off() {
        System.out.println("Mesin dimatikan");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();

        mobil.start();
        mobil.run();
        mobil.stop();
    }
}

