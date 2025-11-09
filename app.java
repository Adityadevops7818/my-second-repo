import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        input.close();
    }
}
//Second code beigns here
public class MyMethods {
    // A method that prints a message
    static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greetUser("Alice"); // Calling the method
        greetUser("Bob");
    }
}
