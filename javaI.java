import java.util.Scanner;

public class javaI {
      public static void main(String[] args) 
      {
        System.out.println("Hello, World!");
        int age = 20;
        double gpa = 3.8;
        boolean isStudent = true;
        String name = "Love";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Student: " + isStudent);

         try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String namez = sc.nextLine();

            System.out.println("Hello " + namez);

            
        }
      }


    
}
