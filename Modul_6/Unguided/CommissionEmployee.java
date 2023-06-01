// 21102121_MANSUR JULIANTO_IF09R 

package Unguided;

public class CommissionEmployee extends Employee {
    private double gajiPokok;
    private double komisi;
    private double totalPenjualan;

    public CommissionEmployee(String nama, String nip, double gajiPokok, double komisi, double totalPenjualan) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (komisi * totalPenjualan);
    }

    @Override
    public void cetakInformasi() {
        System.out.println("================================");
        System.out.println("Karyawan dengan Gaji Komisi");
        System.out.println("--------------------------------");
        super.cetakInformasi();
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Komisi: " + komisi);
        System.out.println("Total Penjualan: " + totalPenjualan);
        System.out.println("Total Gaji: " + hitungGaji());
        System.out.println("================================");
        System.out.println();
    }
}


