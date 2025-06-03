import java.util.Scanner;

public class Lefttriangle {
    public static void main(String[] args) {

        // Same for the Left angel triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the angle number : ");
        int angle = sc.nextInt();

        for(int i = angle; i >= 1; i--){
            for(int j = 1; j <= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
