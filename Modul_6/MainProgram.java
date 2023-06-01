import java.util.Scanner;

abstract class BangunDatar {
    abstract double hitungKeliling();
    abstract double hitungLuas();
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Pilih bangun datar:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi: ");
                    double sisiPersegi = scanner.nextDouble();
                    BangunDatar persegi = new Persegi(sisiPersegi);
                    System.out.println("Keliling: " + persegi.hitungKeliling());
                    System.out.println("Luas: " + persegi.hitungLuas());
                    break;
                case 2:
                    System.out.print("Masukkan panjang: ");
                    double panjangPersegiPanjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebarPersegiPanjang = scanner.nextDouble();
                    BangunDatar persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                    System.out.println("Keliling: " + persegiPanjang.hitungKeliling());
                    System.out.println("Luas: " + persegiPanjang.hitungLuas());
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari: ");
                    double jariJariLingkaran = scanner.nextDouble();
                    BangunDatar lingkaran = new Lingkaran(jariJariLingkaran);
                    System.out.println("Keliling: " + lingkaran.hitungKeliling());
                    System.out.println("Luas: " + lingkaran.hitungLuas());
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.println();
        } while (pilihan != 0);

        scanner.close();
    }
}
