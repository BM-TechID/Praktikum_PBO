// 21102121_MANSUR JULIANTO_IF09R 

package Unguided;

public class SalariedEmployee extends Employee {
    private double gajiMingguan;

    public SalariedEmployee(String nama, String nip, double gajiMingguan) {
        super(nama, nip);
        this.gajiMingguan = gajiMingguan;
    }

    @Override
    public double hitungGaji() {
        return gajiMingguan;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("================================");
        System.out.println("Karyawan dengan Gaji Tetap");
        System.out.println("--------------------------------");
        super.cetakInformasi();
        System.out.println("Gaji Mingguan: " + gajiMingguan);
        System.out.println("Total Gaji: " + hitungGaji());
        System.out.println("================================");
        System.out.println();
    }
}


