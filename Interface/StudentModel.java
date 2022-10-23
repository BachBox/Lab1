package Interface;

import java.util.*;

public class StudentModel {
    List<Student> students = new ArrayList<>();

    

    public StudentModel() {
    }

    public void printStudentList(){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }


    public void inputStudents(Scanner sc) {
        while (true) {
            System.out.println("Input name: ");
            String name = sc.nextLine();
            System.out.println("Input address: ");
            String address = sc.nextLine();
            Student x = new Student(name, address);
            students.add(x);
            System.out.println("Add a student successfully!");
            System.out.println("Do u wanna input new student? Press 1 to continue: ");
            int choice = MyUltil.getAnInteger();
            if (choice != 1){
                printStudentList();
                return;
            }
        }
    }


}
