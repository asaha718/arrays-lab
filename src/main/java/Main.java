import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] allStudents = new String[10];
        int count = 0;

        while (count < 10) {
            System.out.println("enter student name: ");
            String student = scanner.nextLine();
            allStudents[count] = student;
            count++;
        }
        scanner.close();
        
        System.out.println("You have entered the following names:");

        for (String student : allStudents) {
            System.out.println(student);
        }

    }
}
