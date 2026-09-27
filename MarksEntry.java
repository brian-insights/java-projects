import java.util.Scanner;

public class MarksEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students? ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();
        String name[] = new String[numberOfStudents];
        int marks[] = new int[numberOfStudents];
        double total = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
            total += marks[i];
        }
        double average = total / numberOfStudents;

    
        System.out.println("Students entered: " + numberOfStudents);
        System.out.printf("Average mark: %.1f%n", average);

        sc.close();
    }
    
}
