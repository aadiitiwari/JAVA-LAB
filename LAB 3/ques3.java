import java.util.Scanner;

class Student {
    public int rollNo;
    public String name;
    public double cgpa;

    public Student(int roll, String studentName, double studentCgpa) {
        rollNo = roll;
        name = studentName;
        cgpa = studentCgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }
}

public class ques3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll No for student " +(i + 1) + ": ");
            int roll = input.nextInt();
            input.nextLine(); 
            System.out.print("Enter Name for student " +(i + 1) + ": ");
            String name = input.nextLine();
            System.out.print("Enter CGPA for student " +(i + 1) + ": ");
            double cgpa = input.nextDouble();

            students[i] = new Student(roll, name, cgpa);
        }

        double lowestCgpa = Double.MAX_VALUE;
        String lowestCgpaStudentName = "";

        for (Student student : students) {
            if (student.getCgpa() < lowestCgpa) {
                lowestCgpa = student.getCgpa();
                lowestCgpaStudentName = student.getName();
            }
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println("Roll No: " + student.rollNo + "\tName: " + student.name + "\tCGPA: " + student.cgpa);
        }

        System.out.println("\nStudent with the lowest CGPA: " + lowestCgpaStudentName);
    }
}