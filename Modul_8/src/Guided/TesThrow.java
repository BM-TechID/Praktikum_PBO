//21102121_MANSUR JULIANTO_IF09R
package Guided;

public class TesThrow {
    public static void validate (int age) {
        if (age<18) {
            throw new ArithmeticException("Tidak berhak melakukan to vote");

        } else {
            System.out.println("Berhak melakukkan vote");
        }

    }
    public static void main (String[] args) {
        validate(13);
        System.out.println("Sisa code...");
    }
    
}
