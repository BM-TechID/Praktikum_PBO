//21102121_MANSUR JULIANTO
package Modul_3.Karyawan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek scanner untuk input dari user
        Scanner scanner = new Scanner(System.in);

        // Membuat objek karyawan
        Karyawan karyawan = new Karyawan();

        // Meminta input dari user dan mengisi atribut karyawan
        System.out.print("NIP           : ");
        karyawan.setNip(scanner.nextLine());

        System.out.print("Nama          : ");
        karyawan.setNama(scanner.nextLine());

        System.out.print("Alamat        : ");
        karyawan.setAlamat(scanner.nextLine());

        System.out.print("Gaji Pokok    : ");
        karyawan.setGajiPokok(scanner.nextDouble());

        System.out.print("Jml Hari Lemb : ");
        karyawan.setJumlahHariLembur(scanner.nextInt());

        // Menampilkan informasi karyawan
        System.out.println("\n\n=================================================");
        System.out.println("NIP           : " + karyawan.getNip());
        System.out.println("Nama          : " + karyawan.getNama());
        System.out.println("Alamat        : " + karyawan.getAlamat());
        System.out.println("Gaji Pokok    : " + karyawan.getGajiPokok());
        System.out.println("Jml Hari Lemb : " + karyawan.getJumlahHariLembur());
        System.out.println("Total Gaji    : " + karyawan.hitungTotalGaji());
        System.out.println("Total Gaji (+ tunjangan) : " + karyawan.hitungTotalGaji(2000000));
        System.out.println("=================================================");
       
        // Menutup scanner
        scanner.close();
    }

}
