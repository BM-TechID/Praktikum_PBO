package Guided;

public class Dosen {
    String namaDosen;
    private int NIDN;
    private Mahasiswa[] mahasiswas;
    private int jmlMhsw;

    public void setDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public void setNIDN(int NIDN) {
        this.NIDN = NIDN;
    }

    public void setMahasiswas(Mahasiswa[] mahasiswas) {
        this.mahasiswas = mahasiswas;
        this.jmlMhsw = mahasiswas.length;
    }

    public int getNIDN() {
        return NIDN;
    }

    public Mahasiswa[] getMahasiswas() {
        return mahasiswas;
    }

    public int getJmlMhsw() {
        return jmlMhsw;
    }
}
