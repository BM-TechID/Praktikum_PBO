//21102121_MANSUR JULIANTO

public class Mobil {
    protected String noPlat;
    protected String merk;
    protected double pajak;

    public Mobil() {
        // Default constructor
    }

    public Mobil(String noPlat, String merk, double pajak) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak;
    }

    public void tampilInfo() {
        System.out.println("Nomor Plat: " + noPlat);
        System.out.println("Merk: " + merk);
        System.out.println("Pajak: " + pajak);
    }
}
