import java.io.*;

public class KBD12 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            // Creating BufferedReader to read lines from the standard input stream
            br = new BufferedReader(new InputStreamReader(System.in));
        } catch (Exception e) {
            // Catching any exceptions that might occur during input stream initialization
            System.out.println("Error occurred: " + e.getMessage());
            return;
        }

        int no = 0;
        String str = "";
        System.out.println("ENTER NO:");

        try {
            // Reading a line of input from the BufferedReader
            str = br.readLine();
        } catch (Exception e) {
            // Catching any exceptions that might occur during input reading
            System.out.println("Error occurred while reading input: " + e.getMessage());
            return;
        }

        try {
            // Parsing the input string to an integer
            no = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            // Catching NumberFormatException if the input string is not a valid integer
            System.out.println("INVALID INPUT.");
            return;
        }

        int i = 2;
        // Checking if the entered number is prime
        while (i < no) {
            if (no % i == 0) {
                break;
            }
            i++;
        }

        // If i is equal to no, it means the number is only divisible by itself and 1, hence it's prime
        if (i == no) {
            System.out.println("PRIME");
        } else {
            System.out.println("NOT PRIME");
        }
    }
}
