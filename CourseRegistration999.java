import java.util.Scanner;
class Student {
    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    // Parameterized constructor
    Student(String studentName, int rollNumber, double marks,
            String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    // Calculating course fee
    double calculateFee() {
        return courseCredits * 1500;
    }

    // Checking eligibility
    boolean checkEligibility() {
        return marks >= 50;
    }

    // Calculating scholarship percentage
    double calculateScholarship() {

        if (marks >= 85) {
            return 20;
        } 
        else if (marks >= 70) {
            return 10;
        } 
        else {
            return 0;
        }
    }

    // Calculating final fee after scholarship
    double calculateFinalFee() {

        double fee = calculateFee();
        double scholarshipPercent = calculateScholarship();

        double scholarshipAmount = fee * scholarshipPercent / 100;

        return fee - scholarshipAmount;
    }

    // Display all details
    void displayDetails() {
        double fee = calculateFee();
        double scholarshipPercent = calculateScholarship();
        double scholarshipAmount = fee * scholarshipPercent / 100;
        double finalFee = calculateFinalFee();
        System.out.println("\n----- Student Course Registration Details -----");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);
        System.out.println("Eligibility: Eligible");
        System.out.println("Total Course Fee: Rs. " + fee);
        System.out.println("Scholarship: " + scholarshipPercent + "%");
        System.out.println("Scholarship Amount: Rs. " + scholarshipAmount);
        System.out.println("Final Fee: Rs. " + finalFee);
    }
}

public class CourseRegistration999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reading student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
        sc.nextLine(); // clear buffer
        // Reading course details
        System.out.print("Enter course name: ");
        String course = sc.nextLine();
        System.out.print("Enter course credits: ");
        int credits = sc.nextInt();
        // Creating object using parameterized constructor
        Student s = new Student(name, roll, marks, course, credits);
        // Checking eligibility first
        if (s.checkEligibility()) {
            s.displayDetails();
        } 
        else {
            System.out.println("\nStudent is not eligible for course registration.");
        }

        sc.close();
    }
}