import javax.swing.*;

class Number1 {   // Super class
    int rno;

    Number1() {
        rno = 0;
    }

    Number1(int a) {// PARAMETRIZED
        rno = a;
    }

    void setData(int a) {// PARAMETER IS PASSED
        rno = a;
    }

    void setData() {// NO PARAMETER IS PASSED
        try {
            rno = Integer.parseInt(JOptionPane.showInputDialog(null, "Roll No:"));
        } catch (Exception e) {
        }

    }

    public String toString() {
        String s = "\nRoll No:" + rno;
        return s;
    }

    void display() {
        JOptionPane.showMessageDialog(null, toString());
    }
}

class Marks1 extends Number1 {
    int[] marks;
    int total;
    double average;

    Marks1() {
        super();
        marks = new int[5]; // Assuming there are 5 subjects
        total = 0;
        average = 0;
    }

    Marks1(int a, int b) {
        super(a);
        marks = new int[5]; // Assuming there are 5 subjects
        total = b;
        calculateAverage();
    }

    void setData(int a, int[] marks) {
        super.setData();
        this.marks = marks;
        calculateTotal();
        calculateAverage();
    }

    void setData() {
        super.setData();
        try 
        {
            for (int i = 0; i < marks.length; i++) {
                marks[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Marks for Subject " + (i + 1) + ":"));
            }
            calculateTotal();
            calculateAverage();
        } catch (Exception e) {}
    }

    void calculateTotal() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
    }

    void calculateAverage() {
        if (marks.length != 0)
            average = (double) total / marks.length;
    }

    public String toString() {
        String s = super.toString() + "\nMarks:";
        for (int i = 0; i < marks.length; i++) {
            s += "\nSubject " + (i + 1) + ": " + marks[i];
        }
        s += "\nTotal: " + total + "\nAverage: " + average;
        return s;
    }

    void display() {
        JOptionPane.showMessageDialog(null, toString());
    }
}

public class Single_inherit1 {
    public static void main(String[] args) {
        Number1 a = new Number1();
        a.setData();
        a.display();

        Marks1 b = new Marks1();
        b.setData();
        b.display();

        Number1 c = new Marks1();
        c.setData();
        c.display();
    }
}
