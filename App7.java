//PRIME NUMBERS
public class App7 {
    public static void main(String[] args) {
        int n = 2; // Start from 2, as 1 is not a prime number
        String str = "PRIME NUMBERS:\n";

        while (n <= 100) {
            int i;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    break;
                }
            }
            if (i == n) {
                str = str + " " + n;
            }
            n++;
        }
        System.out.println(str);
    }
}
