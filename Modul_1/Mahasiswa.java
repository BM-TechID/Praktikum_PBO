//21102121_MANSUR JULIANTO
package Modul_1;

public class Mahasiswa {
    public static void main(String[] args) {

        // inisialisasi variabel
        String nama = "Mansur Julianto";
        int usia = 20;
        char golDarah = '0';
        float tinggiBadan = 180;
        double beratBadan = 70;
        boolean isPria = true;

        // menampilkan biodata
        System.out.println("Biodata Mahasiswa");
        System.out.println("-----------------");
        System.out.println("Nama        : " + nama);
        System.out.println("Usia        : " + usia + " tahun");
        System.out.println("Gol. Darah  : " + golDarah);
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Berat Badan : " + beratBadan + " kg");
        System.out.println("Jenis Kelamin: " + (isPria ? "Laki-laki" : "Perempuan"));

    }

}
