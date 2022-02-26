import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){

        //Take user input
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //check leap year condition
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");

        sc.close();
    }
}
