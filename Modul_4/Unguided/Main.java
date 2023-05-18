//21102121_MANSUR JULIANTO
package Modul_4.Unguided;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n== DISPLAY DATA KARYAWAN ==");

        // membuat objek Satpam
        Satpam satpam = new Satpam("0042", "Rendra", "Jl. Iik 15", 2000, 300000, 1);
        System.out.println("\n== DATA SATPAM ==");
        satpam.displayData();

        // membuat objek Sales
        Sales sales = new Sales("0185", "Wibisana", "Jl. Ayam 78", 2006, 2000000, 10);
        System.out.println("\n== DATA SALES ==");
        sales.displayData();

        // membuat objek Manajer
        Manajer manajer = new Manajer("Adi", "Jl. Angsa 56", 1999, 1500000, "Keuangan");
        System.out.println("\n-- DATA MANAJER ==");
        manajer.displayData();
    }

}
