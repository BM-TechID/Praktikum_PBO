// 21102121_Mansur Julianto_IF09R
package Unguded;

public class Engine {
    private int cc;
    private String merk;

    public Engine(int cc, String merk) {
        this.cc = cc;
        this.merk = merk;
    }

    public void on() {
        System.out.println("Mesin dinyalakan");
    }

    public void off() {
        System.out.println("Mesin dimatikan");
    }

    public int getCc() {
        return cc;
    }

    public String getMerk() {
        return merk;
    }
}

