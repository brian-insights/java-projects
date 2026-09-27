import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Mathematics marks: ");
        double mathsScore = scanner.nextDouble();

        System.out.print("Enter Computer Science marks: ");
        double compScore = scanner.nextDouble();

        System.out.print("Enter English marks: ");
        double englishScore = scanner.nextDouble();

        double average = ((mathsScore + compScore + englishScore) / 3);

        System.out.println("Hello " + name);
        System.out.printf("Your average is %.1f%n", average);

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
        else{
            System.out.println("your grade is F");
        }
        scanner.close();
    }
}