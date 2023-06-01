//21102121_MANSUR JULIANTO

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil = new Mobil("B 1234 AB", "Toyota", 1000000);
        mobil.tampilInfo();
        System.out.println();

        // Membuat objek Bus
        Bus bus = new Bus("B 5678 CD", "Mercedes", 1500000, 30, 5);
        bus.tampilInfo();
        bus.infoBus();
        System.out.println("Pajak Bus: " + bus.hitungPajak());
        System.out.println();

        // Membuat objek Sedan
        Sedan sedan = new Sedan("B 9012 EF", "Honda", 800000, "Airbag", 1500, "AC");
        sedan.tampilInfo();
        sedan.infoSedan();
        System.out.println("Pajak Sedan: " + sedan.hitungPajak());
        System.out.println();

        // Membuat objek MiniBus
        MiniBus minibus1 = new MiniBus("B 3456 GH", "Mitsubishi", 1200000, "ABS", 1800, "DVD", "Pribadi");
        minibus1.tampilInfo();
        minibus1.infoMiniBus();
        System.out.println("Pajak MiniBus (Tipe Pribadi): " + minibus1.hitungPajak());
        System.out.println();

        MiniBus minibus2 = new MiniBus("B 7890 IJ", "Isuzu", 2000000, "Airbag", 2000, "AC", "Wagon");
        minibus2.tampilInfo();
        minibus2.infoMiniBus();
        System.out.println("Pajak MiniBus (Tipe Wagon): " + minibus2.hitungPajak());
    }
}
