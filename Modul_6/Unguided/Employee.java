// 21102121_MANSUR JULIANTO_IF09R 

package Unguided;

public abstract class Employee {
    private String nama;
    private String nip;

    public Employee(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public abstract double hitungGaji();

    public void cetakInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
    }
}


