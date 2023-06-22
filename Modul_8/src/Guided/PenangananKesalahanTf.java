//21102121_MANSUR JULIANTO_IF09R

package Guided;

public class PenangananKesalahanTf {
     public static void main (String [] args) {
        System.out.println("Sebelum pembagian");
        try {
            System.out.println("Hasil Bagi: " + 5/0);
        } catch (Throwable e) {
            System.out.println("Ada keslahan: " + e);
        } finally {
            System.out.println("Hi... Finally");
        }
            System.out.println("Setelah pembagian");
    }
    
}
