//21102121_MANSUR JULIANTO
package Modul_2.Bank;

import java.util.Scanner;

public class BankBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(100000);
        String pilihan = "";

        System.out.println("==============================================");
        System.out.println("         Selamat Datang di Bank ABC");
        System.out.println("==============================================");

        do {
            System.out.println(" ");
            System.out.println("==============================================");
            System.out.println("                  Menu");
            System.out.println("==============================================");
            System.out.println("1. Tampil Saldo");
            System.out.println("2. Simpan Uang");
            System.out.println("3. Ambil Uang");
            System.out.println("4. Keluar");
            System.out.println("==============================================");

            System.out.print("Silahkan Pilih Menu: ");
            pilihan = scanner.next();

            if (pilihan.equals("1")) {
                System.out.println("\n==============================================");
                System.out.println("            Tampil Saldo");
                System.out.println("==============================================");
                System.out.printf("Saldo Saat Ini: Rp. %d\n", bank.getSaldo());
                System.out.println("==============================================\n");
                System.out.print("Kembali?(Y/N) ");
                pilihan = scanner.next();
            } else if (pilihan.equals("2")) {
                System.out.println("\n==============================================");
                System.out.println("             Simpan Uang");
                System.out.println("==============================================");
                System.out.print("Simpan Uang: Rp. ");
                int uang = scanner.nextInt();
                bank.simpanUang(uang);
                System.out.printf("Saldo Saat Ini: Rp. %d\n", bank.getSaldo());
                System.out.println("==============================================\n");
                System.out.print("Kembali?(Y/N) ");
                pilihan = scanner.next();
            } else if (pilihan.equals("3")) {
                System.out.println("\n==============================================");
                System.out.println("              Ambil Uang");
                System.out.println("==============================================");
                System.out.print("Ambil Uang: Rp. ");
                int uang = scanner.nextInt();
                bank.ambilUang(uang);
                System.out.printf("Saldo Saat Ini: Rp. %d\n", bank.getSaldo());
                System.out.println("==============================================\n");
                System.out.print("Kembali?(Y/N) ");
                pilihan = scanner.next();
            } else if (pilihan.equals("4")) {
                System.out.println("Terima kasih telah menggunakan layanan kami.");
            } else {
                System.out.println("Menu tidak valid. Silahkan pilih menu yang tersedia.");
            }

        } while (!pilihan.equals("4"));
    }

}
