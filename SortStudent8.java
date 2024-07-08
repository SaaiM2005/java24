import javax.swing.*;
import java.util.*;

class Student8 implements Comparable<Student8>, Comparator<Student8> {
    int no;
    String snm;
    String tnm;
    double mrk;

    Student8() {
        no = 0;
        mrk = 0.0;
        snm = new String();
        tnm = new String();
    }

    Student8(int a, String b, String c, double d) {
        no = a;
        snm = b;
        tnm = c;
        mrk = d;
    }

    public String toString() {
        return "\nNO:" + no + "\nNAME:" + snm + "\nTRADE:" + tnm + "\nMARKS:" + mrk;
    }

    void display() {
        JOptionPane.showMessageDialog(null, toString());
    }

    public int compareTo(Student8 a) {
        return no - a.no;
    }

    public int compare(Student8 a, Student8 b) {
        Double c = a.mrk;
        Double d = b.mrk;
        return c.compareTo(d);
    }

    public static Comparator<Student8> StuName = new Comparator<Student8>() {
        public int compare(Student8 a, Student8 b) {
            return (a.snm).compareTo(b.snm);
        }
    };
}

class Student8Sort {
    public static Comparator<Student8> TrdName = new Comparator<Student8>() {
        public int compare(Student8 a, Student8 b) {
            return (a.tnm).compareTo(b.tnm);
        }
    };
}

public class SortStudent8 {
    public static void main(String[] args) {
        Student8[] a = new Student8[5];

        a[0] = new Student8(13, "RAVI", "MECH", 9.2);
        a[1] = new Student8(8, "ANA", "ELECTRICAL", 6.8);
        a[2] = new Student8(43, "ARYA", "CSE", 9.4);
        a[3] = new Student8(29, "SUNIL", "MECH", 8.9);
        a[4] = new Student8(13, "AMITA", "CSE", 7.4);

        System.out.println("Original array: " + Arrays.toString(a));
        Arrays.sort(a); // NUMBER WISE SORTING
        System.out.println("Sorted by number: " + Arrays.toString(a));
        Arrays.sort(a, new Student8()); // MARKS
        System.out.println("Sorted by marks: " + Arrays.toString(a));
        Arrays.sort(a, Student8.StuName); // STUDENT NAME WISE
        System.out.println("Sorted by name: " + Arrays.toString(a));
        Arrays.sort(a, Student8Sort.TrdName); // TRADE NAME WISE
        System.out.println("Sorted by trade name: " + Arrays.toString(a));
    }
}
