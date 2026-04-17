import java.util.ArrayList;
import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagementSystem {

    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                switch (choice) {
                    case 1 -> addStudent();
                    case 2 -> viewStudents();
                    case 3 -> updateStudent();
                    case 4 -> deleteStudent();
                    case 5 -> searchStudent();
                    case 6 -> System.out.println("Exiting program...");
                    default -> System.out.println("Invalid choice! Try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine(); // clear invalid input
                choice = 0;
            }

        } while (choice != 6);
    }

    //  Add Student
    private static void addStudent() {
        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Grade (0-100): ");
            double grade = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Student ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Contact: ");
            String contact = sc.nextLine();

            Student student = new Student(name, age, grade, id, contact);
            students.add(student);

            System.out.println("✅ Student added successfully!");

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
            sc.nextLine(); // clear buffer
        }
    }

    //  View Students
    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.printf("%-15s %-5s %-8s %-12s %-15s%n",
                "Name", "Age", "Grade", "Student ID", "Contact");
        System.out.println("---------------------------------------------------------------");

        for (Student s : students) {
            s.display();
        }
    }

    //  Update Student
    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        String id = sc.nextLine();

        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                try {
                    System.out.print("Enter New Name: ");
                    s.setName(sc.nextLine());

                    System.out.print("Enter New Age: ");
                    s.setAge(sc.nextInt());

                    System.out.print("Enter New Grade: ");
                    s.setGrade(sc.nextDouble());
                    sc.nextLine();

                    System.out.print("Enter New Contact: ");
                    s.setContact(sc.nextLine());

                    System.out.println("✅ Student updated successfully!");

                } catch (Exception e) {
                    System.out.println("❌ Error: " + e.getMessage());
                    sc.nextLine();
                }
                return;
            }
        }

        System.out.println("❌ Student not found!");
    }

    //  Delete Student
    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        String id = sc.nextLine();

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getStudentId().equals(id)) {
                iterator.remove();
                System.out.println("✅ Student deleted successfully!");
                return;
            }
        }

        System.out.println("❌ Student not found!");
    }

    //  Search Student
    private static void searchStudent() {
        System.out.println("1. Search by ID");
        System.out.println("2. Search by Name");
        System.out.print("Enter choice: ");

        int choice;
        try {
            choice = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            sc.nextLine();
            return;
        }

        boolean found = false;

        if (choice == 1) {
            System.out.print("Enter Student ID: ");
            String id = sc.nextLine();

            for (Student s : students) {
                if (s.getStudentId().equals(id)) {
                    printHeader();
                    s.display();
                    found = true;
                }
            }

        } else if (choice == 2) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            for (Student s : students) {
                if (s.getName().equalsIgnoreCase(name)) {
                    printHeader();
                    s.display();
                    found = true;
                }
            }

        } else {
            System.out.println("Invalid choice!");
            return;
        }

        if (!found) {
            System.out.println("❌ No matching student found.");
        }
    }

    private static void printHeader() {
        System.out.printf("%-15s %-5s %-8s %-12s %-15s%n",
                "Name", "Age", "Grade", "Student ID", "Contact");
        System.out.println("---------------------------------------------------------------");
    }
}