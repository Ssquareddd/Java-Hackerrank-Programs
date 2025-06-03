import java.util.Scanner;

public class Leap_year_calculator {
    public static void main(String[] args) {

        // To check where the entered year is a leap year

        Scanner year  = new Scanner(System.in);
        System.out.println("Enter the year for check: ");
        int years = year.nextInt();

        boolean isLeapyear = false;

        if ((years%4 == 0 && years%100 != 0) ||(years % 400 == 0)){
            isLeapyear = true;
        }
        if(isLeapyear){
            System.out.println(year + "its a Leap year");
        }else{
            System.out.println(year + "its not a Leap year");
        }
        year.close();
    }
}
