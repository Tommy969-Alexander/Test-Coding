import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
     
     void display() {
        System.out.println("Name: " + name + ", Roll: " + roll );
     }
}  

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice ==1) {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter roll number");
                int roll = scanner.nextInt();
                student.add(new Student(name, roll));
                System.out.println("Student added! ");
             } else if (choice == 2) {
                System.out.println("\nAll Student:");
                for (Student s : student) {
                    s.display();
                }
             } else if (choice !=0) {
                System.out.println("Invalid choice.");

            }
             
        } while (choice !=0);

        System.out.println("Goodbye!");
        scanner.close();
     }
}