//21102121_MANSUR JULIANTO_IF09R
package Guided;

import java.util.ArrayList;
import java.util.List;

public class TesThrow2 {
    private static java.util.List<Integer> Integers = new ArrayList<Integer>();
    public static void addInteger(Integer value) throws IllegalArgumentException {
        if (Integers.contains(value)){
            throw new IllegalArgumentException("integer alredy added.");
        }
            Integers.add(value);
    }

    public static void main (String[] args) {
        try {
            addInteger(1);
            addInteger(2);
            addInteger(3);
            addInteger(1);
        } catch (IllegalArgumentException ise) {
            //ine.printStackTrace();
            System.out.println("Terjadi kesalahan: " + ise);
        }
        for (int i=0; i<Integers.size(); i++) {
            System.out.println(Integers.get(i) + "");
        }
    }
    
}
