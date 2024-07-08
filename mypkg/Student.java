package mypkg;

import java.io.*;
import mypkg.Util;

public class Student implements Serializable {
    int rollNo;
    String name;
    double marks;
    boolean state;

    public Student() {
        rollNo = 0;
        marks = 0.0;
        state = true;
    }

    public String toString() {
        String s = "\nRoll No: " + rollNo + "\nName: " + name + "\nMarks: " + marks + "\nState: " + state;
        return s;
    }

    public void display() {
        Util.display(toString());
    }

    public void setData(int n) {
        rollNo = n;
        name = Util.sInput("Name:");
        marks = Util.dInput("Marks:");
        state = true;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public boolean getState() {
        return state;
    }

    public void delete() {
        state = false;
    }
}