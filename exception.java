public class exception{


    public static void main(String[] args) {
        String name;
        int  marks;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        name=sc.nextline();
        System.out.println("Enter the marks of the student:");

        marks=sc.nextInt();
        try {            validateMarks(marks);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    static void validateMarks(int marks) throws InvalidMarksException{
        if(marks<0 || marks>100){
            throw new InvalidMarksException("Marks should be between 0 and 100");
        }
    }
}