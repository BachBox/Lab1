package Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // a1.displayInfo();
        // System.out.println("After recharge: ");
        // a1.recharge(200000000);
        // a1.displayInfo();
        Scanner sc = new Scanner(System.in);
        StudentModel studentModel = new StudentModel();
        studentModel.inputStudents(sc);
    }
}
