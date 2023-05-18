//21102121_MANSUR JULIANTO
package Modul_4.Unguided;

public class Manajer extends Pegawai {
    private double gajiPokok;
    private String divisi;
    private double tunjanganJabatan;

    public Manajer(String nama, String alamat, int tahunMasuk, double gajiPokok, String divisi) {
        super("0005", nama, alamat, tahunMasuk);
        this.gajiPokok = gajiPokok;
        this.divisi = divisi;
        this.tunjanganJabatan = hitungTunjanganJabatan(tahunMasuk);
    }

    private double hitungTunjanganJabatan(int tahunMasuk) {
        int masaKerja = 2015 - tahunMasuk;
        if (masaKerja >= 5) {
            return gajiPokok * 0.1;
        } else if (masaKerja >= 3) {
            return gajiPokok * 0.05;
        } else {
            return 0;
        }
    }

    @Override
    public double hitungGajiAkhir() {
        return gajiPokok + tunjanganJabatan;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Divisi : " + divisi);
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("Gaji Total Manajer : Rp. " + hitungGajiAkhir());
    }
}
