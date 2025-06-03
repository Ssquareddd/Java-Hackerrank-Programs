import java.util.Scanner;

public class PyramidTriangle {
    public static void main(String[] args) {

        // Printing the Pyramid Triangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side : ");
        int side = sc.nextInt();

        for(int i = 1; i <= side; i++){
            for(int j = 1; j <= side-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
