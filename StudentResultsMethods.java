import java.util.Scanner;

class StudentResultsMethods {

    static Scanner sc = new Scanner(System.in);

    static int noOfStudents;
    static String[] name;
    static int[] marks;

    static int total = 0;
    static int highestScore = 0;
    static String topStudent;

    public static void main(String[] args) {

        System.out.print("How many students? ");
        noOfStudents = sc.nextInt();
        sc.nextLine();

        // Create arrays after knowing number of students
        name = new String[noOfStudents];
        marks = new int[noOfStudents];

        StudentResultsMethods obj = new StudentResultsMethods();

        // Get student information
        obj.getInputs();

        // Calculate average
        double average = obj.calculateAverage();

        // Display results
        obj.displayResults(average);

        sc.close();
    }

    // Method 1: Get student names and marks
    void getInputs() {

        int i = 0;

        while (i < noOfStudents) {

            System.out.print("Enter name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter mark: ");
            marks[i] = sc.nextInt();

            // Validate marks
            while (marks[i] < 0 || marks[i] > 100) {

                System.out.println(
                    "Invalid score. Try a score between 0-100: ");

                marks[i] = sc.nextInt();
            }

            // Add valid mark to total
            total += marks[i];

            // Find highest score
            if (marks[i] >= highestScore) {
                highestScore = marks[i];
                topStudent = name[i];
            }

            sc.nextLine();

            i++;
        }
    }

    // Method 2: Calculate average
    double calculateAverage() {

        double average = (double) total / noOfStudents;

        return average;
    }

    // Method 3: Determine grade
    String getGrade(int mark) {

        if (mark >= 70) {
            return "A";
        }
        else if (mark >= 60) {
            return "B";
        }
        else if (mark >= 50) {
            return "C";
        }
        else if (mark >= 40) {
            return "D";
        }
        else {
            return "F";
        }
    }

    // Method 4: Display results
    void displayResults(double average) {

        System.out.println();
        System.out.println("************* RESULTS *************");

        System.out.printf("%-20s %10s %10s%n","Student Name", "Marks", "Grade");

        System.out.println("--------------------------------------------");

        for (int i = 0; i < noOfStudents; i++) {

            String grade = getGrade(marks[i]);

            System.out.printf("%-20s %10d %10s%n", name[i], marks[i], grade);
        }

        System.out.println("--------------------------------------------");

        System.out.printf("Class Average: %.2f%n", average);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Top Student: " + topStudent);
    }
}

//keep practicing...