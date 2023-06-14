//21102121_Mansur Julianto_IF09R

package Guided;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setDosen("Pak Dedy");
        dosen.setNIDN(11111);

        Mahasiswa[] mahasiswas = new Mahasiswa[3];
        mahasiswas[0] = new Mahasiswa();
        mahasiswas[0].setNIM(19103041);
        mahasiswas[1] = new Mahasiswa();
        mahasiswas[1].setNIM(19103099);
        mahasiswas[2] = new Mahasiswa();
        mahasiswas[2].setNIM(19103012);

        dosen.setMahasiswas(mahasiswas);

        System.out.println("Dosen: " + dosen.namaDosen);

        System.out.println("NIDN: " + dosen.getNIDN());
        System.out.println("Memiliki Mahasiswa dengan NIM:");

        for (Mahasiswa mahasiswa : dosen.getMahasiswas()) {
            System.out.println("NIM: " + mahasiswa.getNIM());
        }
    }
}
