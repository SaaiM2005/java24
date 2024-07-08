import javax.swing.JOptionPane;

public class OddEvenChecker {
    public static void main(String[] args) {
        // Input number from user using JOptionPane
        String input = JOptionPane.showInputDialog("Enter a number:");
        
        // Convert input string to integer
        int number = Integer.parseInt(input);
        
        // Check if the number is odd or even
        if (number % 2 == 0) {
            JOptionPane.showMessageDialog(null, "The number " + number + " is even.");
        } else {
            JOptionPane.showMessageDialog(null, "The number " + number + " is odd.");
        }
    }
}
