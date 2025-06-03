import java.util.Scanner;

public class TraingleClassifier {
    public static void main(String[] args) {

        // Checking triangle classifier based on size input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n side length");
        int n = sc.nextInt();
        System.out.println("enter k side length");
        int k = sc.nextInt();
        System.out.println("enter j side length");
        int j = sc.nextInt();

        if (n == k && k == j){
            System.out.println("YES it is a equilateral triangle");
        }
        else if(n == k || k == j || n == j){
            System.out.println("YES it is a isosceles triangle");
        }
        else{
            System.out.println("Its a Scalene Traingle");
        }
        sc.close();
        }
}
