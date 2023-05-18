//21102121_MANSUR JULIANTO
package Modul_4.Unguided;

public class Satpam extends Pegawai {
    private double gajiPokok;
    private int jamLembur;

    public Satpam(String nip, String nama, String alamat, int tahunMasuk, double gajiPokok, int jamLembur) {
        super(nip, nama, alamat, tahunMasuk);
        this.gajiPokok = gajiPokok;
        this.jamLembur = jamLembur;
    }

    @Override
    public double hitungGajiAkhir() {
        return gajiPokok + (jamLembur * 10000);
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Jam Lembur + S/jam");
        System.out.println("Gaji Pokok s Rp. " + gajiPokok);
        System.out.println("Gaji Total Satpam : Rp. " + hitungGajiAkhir());
    }
}
