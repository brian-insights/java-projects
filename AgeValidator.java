import java.util.Scanner;

class AgeValidator{
    public static void main(String []a){
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Hello " + name);
        System.out.println("You're " + age + " years old");

        if (age < 18) {
            System.out.println("You're a minor.");
        }
        else
            System.out.println("You're an adult.");
        sc.close();
    }
}