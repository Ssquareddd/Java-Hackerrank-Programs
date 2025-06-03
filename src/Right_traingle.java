import java.util.Scanner;

public class Right_traingle {
    public static void main(String[] args) {

        Scanner angle = new Scanner(System.in);
        System.out.println("enter the number for triangle : ");
        int add = angle.nextInt();

        for(int i = 0; i < add; i ++){
            for(int j = 0; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        angle.close();
    }
}
