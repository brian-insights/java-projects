import java.util.Scanner;

public class StudentResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Maths: ");
        double mathsScore = scanner.nextDouble();
        System.out.print("English: ");
        double englishScore = scanner.nextDouble();
        System.out.print("Computer:");
        double compScore = scanner.nextDouble();
        System.out.print("Geography: ");
        double geographyScore = scanner.nextDouble();
        System.out.print("Physics: ");
        double physicsScore = scanner.nextDouble();

        System.out.println("*** SUBJECT ***    ***SCORE***");
        System.out.println("    MATHS              " + mathsScore);
        System.out.println("    ENGLISH            " + englishScore);
        System.out.println("    COMPUTER           " + compScore);
        System.out.println("    GEOGRAPHY          " + geographyScore);
        System.out.println("    PHYSICS            " + physicsScore);

        //calculating the average
        double average = (mathsScore + englishScore + compScore + geographyScore + physicsScore) / 5;

        //Display results
        System.out.println("Hello " + name);
        System.out.printf("your average is %.1f%n", average);
        //display grade
        if (average >= 70) {
            System.out.println("your grade is A");
        }
        else if (average >= 60) {
            System.out.println("your grade is B");
        }
        else if (average >= 50) {
            System.out.println("your grade is C");
        }
        else if (average >= 40) {
            System.out.println("your grade is D");

        }
        else {
            System.out.println("your grade is F");
        }
        scanner.close();

    }

    }
