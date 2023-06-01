// 21102121_MANSUR JULIANTO_IF09R 

package Unguided;

public class ProjectPlanner extends Employee {
    private double gajiPokok;
    private double komisi;
    private double totalHasilProyek;

    public ProjectPlanner(String nama, String nip, double gajiPokok, double komisi, double totalHasilProyek) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalHasilProyek = totalHasilProyek;
    }

    @Override
    public double hitungGaji() {
        double pajak = gajiPokok * 0.05;
        return gajiPokok + (komisi * totalHasilProyek) - pajak;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("================================");
        System.out.println("Karyawan Project Planner");
        System.out.println("--------------------------------");
        super.cetakInformasi();
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Komisi: " + komisi);
        System.out.println("Total Hasil Proyek: " + totalHasilProyek);
        System.out.println("Total Gaji: " + hitungGaji());
        System.out.println("================================");
        System.out.println();
    }
}
