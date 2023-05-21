public class Bus extends Mobil {
    private int kapasitasPenumpang;
    private int kapasitasBagasi;

    public Bus() {
        // Default constructor
    }

    public Bus(String noPlat, String merk, double pajak, int kapasitasPenumpang, int kapasitasBagasi) {
        super(noPlat, merk, pajak);
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.kapasitasBagasi = kapasitasBagasi;
    }

    public void infoBus() {
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
        System.out.println("Kapasitas Bagasi: " + kapasitasBagasi);
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        infoBus();
    }

    public double hitungPajak() {
        return pajak + (pajak * kapasitasPenumpang * kapasitasBagasi * 0.00005);
    }
}
