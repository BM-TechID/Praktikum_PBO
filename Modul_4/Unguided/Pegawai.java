//21102121_MANSUR JULIANTO
package Modul_4.Unguided;

public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;
    private int tahunMasuk;

    public Pegawai(String nip, String nama, String alamat, int tahunMasuk) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.tahunMasuk = tahunMasuk;
    }

    public double hitungGajiAkhir() {
        return 0;
    }

    public void displayData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Alamat : " + alamat);
        System.out.println("Tahun Masuk Kerja : " + tahunMasuk);
    }
}
