//21102121_MANSUR JULIANTO_IF09R

package Unguided;

public class AgeValidator {
    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Umur tidak boleh negatif");
        }
        System.out.println("Umur valid: " + age);
    }

    public static void main(String[] args) {
        int age = -5;
        try {
            validateAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}

