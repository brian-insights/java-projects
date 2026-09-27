import java.util.Scanner;
public class GradingSystem{
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students? ");
        int noOfStudents = sc.nextInt();
        sc.nextLine();
        String name[] = new String[noOfStudents];
        int marks[] = new int[noOfStudents];
        int total = 0;
        int highestScore = 0;
        String topStudent = null;
        //String grade[] = new String[noOfStudents];
        for (int i = 0; i < noOfStudents; i++) {
            System.out.print("Enter name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
            while (marks[i] > 100 || marks[i] < 0) {
                System.out.print("Invalid marks. Must be between 0-100.\n Try again: ");
                marks[i] = sc.nextInt();
            }

            sc.nextLine();
            total += marks[i];

            // if (marks[i] >= 70) {
            //     grade[i] = "A";
            // }
            // else if (marks[i] >= 60) {
            //     grade[i] = "B";
            // }
            // else if (marks[i] >= 50) {
            //     grade[i] = "C";
            // }
            // else if (marks[i] >= 40) {
            //     grade[i] = "D";
            // }
            // else
            // {
            //     grade[i] = "F";
            // }

            if (marks[i] >= highestScore) {
                highestScore = marks[i];
                topStudent = name[i];
            }
        }
        double average = (double) total / noOfStudents;


        System.out.println("***********RESULTS***********");
        System.out.printf("NAME       MARKS       GRADE\n");
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println();
            String grade;

            
            if (marks[i] >= 70) {
                grade = "A";
            } else if (marks[i] >= 60) {
                grade = "B";
            } else if (marks[i] >= 50) {
                grade = "C";
            } else if (marks[i] >= 40) {
                grade = "D";
            } else {
                grade = "E";
            }
            System.out.printf("%-15s %5d %10s%n", name[i], marks[i], grade);

        }
        System.out.println();
        System.out.printf("Average: %.2f%n", average);
        System.out.println();
        System.out.println("Top Student: " + topStudent);
        System.out.println("Highest Score: " + highestScore);
        sc.close();
        
    }
}
