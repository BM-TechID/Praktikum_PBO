//21102121_MANSUR JULIANTO
package Modul_4.Unguided;

public class Sales extends Pegawai {
    private double gajiPokok;
    private int jumlahPelanggan;

    public Sales(String nip, String nama, String alamat, int tahunMasuk, double gajiPokok, int jumlahPelanggan) {
        super(nip, nama, alamat, tahunMasuk);
        this.gajiPokok = gajiPokok;
        this.jumlahPelanggan = jumlahPelanggan;
    }

    @Override
    public double hitungGajiAkhir() {
        return gajiPokok + (jumlahPelanggan * 50000);
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Jumlah Pelanggan : " + jumlahPelanggan + "/orang");
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("Gaji Total Sales : Rp. " + hitungGajiAkhir());
    }
}
