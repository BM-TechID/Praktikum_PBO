//21102121_MANSUR JULIANTO_IF09R

package Guided;

public class MultipleCatch { 
    public static void main (String[] args) {
        try {
            int a[] = new int[5];
            a[5]=30/0;

        } catch ( ArithmeticException e) {
            System.out.println("Ada kesalahan: Aritmatic exception ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ada kesalahan: Array index out of bounds exception");
        }
            System.out.println("Setelah exception");
    }
    
}
