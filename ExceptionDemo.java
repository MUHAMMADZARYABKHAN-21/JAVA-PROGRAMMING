import java.util.Scanner;

// Custom Exception Class
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    public static void main(String[] args) {

        String name;
        int marks;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the student:");
        name = sc.nextLine();

        System.out.println("Enter the marks of the student:");
        marks = sc.nextInt();

        try {
            validateMarks(marks);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100");
        }
    }
}