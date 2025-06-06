import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // Printing the num from 1 to 100
        // if the num is multiple of 5 i will print buzz
        // if the num is multiple of 3 i will print fuzz
        // if the num is multiple of both 3 and 4 i will print fuzzbuzz

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
            in.close();
        }
    }
}
