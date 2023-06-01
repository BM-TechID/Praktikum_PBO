//21102121_MANSUR JULIANTO

public class Sedan extends Mobil {
    private String fasilitasKeamanan;
    private int kapasitasCC;
    private String fasilitasKenyamanan;

    public Sedan(String noPlat, String merk, double pajak, String fasilitasKeamanan, int kapasitasCC, String fasilitasKenyamanan) {
        super(noPlat, merk, pajak);
        this.fasilitasKeamanan = fasilitasKeamanan;
        this.kapasitasCC = kapasitasCC;
        this.fasilitasKenyamanan = fasilitasKenyamanan;
    }

    public void infoSedan() {
        System.out.println("Fasilitas Keamanan: " + fasilitasKeamanan);
        System.out.println("Kapasitas CC: " + kapasitasCC);
        System.out.println("Fasilitas Kenyamanan: " + fasilitasKenyamanan);
    }

    public void tampilInfo() {
        super.tampilInfo();
    }

    public float hitungPajak() {
        return (float) (pajak + (pajak * kapasitasCC * 0.00005));
    }
}