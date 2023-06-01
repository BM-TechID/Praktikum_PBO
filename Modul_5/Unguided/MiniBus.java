//21102121_MANSUR JULIANTO

public class MiniBus extends Sedan {
    private String tipe;

    public MiniBus(String noPlat, String merk, double pajak, String fasilitasKeamanan, int kapasitasCC, String fasilitasKenyamanan, String tipe) {
        super(noPlat, merk, pajak, fasilitasKeamanan, kapasitasCC, fasilitasKenyamanan);
        this.tipe = tipe;
    }

    public void infoMiniBus() {
        if (tipe.equals("Pribadi")) {
            System.out.println("Tipe MiniBus: Pribadi, digunakan sebagai kendaraan pribadi");
        } else if (tipe.equals("Wagon")) {
            System.out.println("Tipe MiniBus: Wagon, digunakan sebagai kendaraan angkut/travel");
        }
    }

    public void tampilInfo() {
        super.tampilInfo();
    }

    public float hitungPajak() {
        if (tipe.equals("Pribadi")) {
            return (super.hitungPajak() * 0.05f) + (super.hitungPajak() * 0.03f);
        } else if (tipe.equals("Wagon")) {
            return (super.hitungPajak() * 0.03f) + (super.hitungPajak() * 0.05f);
        } else {
            return 0.0f;
        }
    }
}
