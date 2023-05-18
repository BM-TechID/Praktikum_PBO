//21102121_MANSUR JULIANTO
package Modul_1;

import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("|      Program Hitung Luas        |");
        System.out.println("===================================");
        System.out.println("|          Pilih Menu:            |");
        System.out.println("|                                 |");
        System.out.println("| 1. Luas Segitiga                |");
        System.out.println("| 2. Luas Lingkaran               |");
        System.out.println("| 3. Luas Persegi                 |");
        System.out.println("| 4. Luas Persegi Panjang         |");
        System.out.println("|                                 |");
        System.out.println("===================================");

        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan alas segitiga: ");
                double alasSegitiga = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggiSegitiga = input.nextDouble();
                double luasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
                System.out.println("===================================");
                System.out.println("|         Luas Segitiga           |");
                System.out.println("===================================");
                System.out.printf("| Alas: %.2f                     |\n", alasSegitiga);
                System.out.printf("| Tinggi: %.2f                   |\n", tinggiSegitiga);
                System.out.printf("| Luas: %.2f                     |\n", luasSegitiga);
                System.out.println("===================================");
                break;
            case 2:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                double luasLingkaran = Math.PI * jariJari * jariJari;
                System.out.println("===================================");
                System.out.println("|         Luas Lingkaran          |");
                System.out.println("===================================");
                System.out.printf("| Jari-jari: %.2f                |\n", jariJari);
                System.out.printf("| Luas: %.2f                     |\n", luasLingkaran);
                System.out.println("===================================");
                break;
            case 3:
                System.out.print("Masukkan sisi persegi: ");
                double sisiPersegi = input.nextDouble();
                double luasPersegi = sisiPersegi * sisiPersegi;
                System.out.println("===================================");
                System.out.println("|         Luas Persegi            |");
                System.out.println("===================================");
                System.out.printf("| Sisi: %.2f                     |\n", sisiPersegi);
                System.out.printf("| Luas: %.2f                     |\n", luasPersegi);
                System.out.println("===================================");
                break;
            case 4:
                System.out.println("──────────────");
                System.out.println("   Luas Persegi Panjang");
                System.out.println("──────────────");
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();
                double luasPersegiPanjang = panjang * lebar;
                System.out.println("Luas persegi panjang = " + luasPersegiPanjang);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        input.close();
    }

}
