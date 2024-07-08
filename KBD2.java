import java.util.*;

public class KBD2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("STRING:");
        String str = s.next();
        System.out.println(str);

        String[] a = new String[5]; // Corrected array declaration

        int i = 0;
        while (i < a.length) {
            System.out.println("CITY NAME " + i + ":");
            a[i] = s.next();
            i++;
        }

        // Closing the Scanner object
        s.close();

        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
