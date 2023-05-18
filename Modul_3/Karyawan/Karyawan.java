
//21102121_MANSUR JULIANTO
package Modul_3.Karyawan;

public class Karyawan {
    // Attributes
    private String nip;
    private String nama;
    private String alamat;
    private int jumlahHariLembur;
    private double gajiPokok;

    // Accessor
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJumlahHariLembur() {
        return jumlahHariLembur;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    // Mutator
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJumlahHariLembur(int jumlahHariLembur) {
        this.jumlahHariLembur = jumlahHariLembur;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Method Overloading
    public double hitungTotalGaji() {
        return gajiPokok + (gajiPokok * jumlahHariLembur * 0.01);
    }

    public double hitungTotalGaji(double tunjangan) {
        return hitungTotalGaji() + tunjangan;
    }
    
}
