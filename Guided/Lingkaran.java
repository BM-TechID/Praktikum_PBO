// 21102121_MANSUR JULIANTO_IF09R 

package Guided;

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

