public class Student {
    private String name;
    private int age;
    private double grade;
    private String studentId;
    private String contact;

    public Student(String name, int age, double grade, String studentId, String contact) {
        this.name = name;
        setAge(age);        // validation
        setGrade(grade);    // validation
        this.studentId = studentId;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getContact() {
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be a positive number.");
        }
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void display() {
        System.out.printf("%-15s %-5d %-8.2f %-12s %-15s%n",name, age, grade, studentId, contact);
    }
}