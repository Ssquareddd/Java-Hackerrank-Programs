import java.util.Scanner;

public class Taking_input_from_user {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name:"); // Prompting the user for input

        String name = input.nextLine(); // Reading line of text from the user
        System.out.println("Enter the age:"); // Prompting for a number

        int age = input.nextInt();  // Reading a integer entered by user

        System.out.println("Hello " + name + " , "+ " your age is :" + age + ".");

        input.close(); // Closing the input class because it should be done.


    }
}
