import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]){

        //variables
        int number;
        int sum=0;

        Scanner sc=new Scanner(System.in);

        //taking input from user
        System.out.print("Enter the number: ");
        number = sc.nextInt();

        //executing loop to find the sum
        for(int i = 1; i <= number/2; i++)
        {
            if(number % i == 0)
            {
                sum = sum + i;
            }
        }

        //checking no. is perfect or not
        if(sum==number)
            System.out.println(number+" is a perfect number.");
        else
            System.out.println(number+" is not a perfect number.");

        sc.close();
    }
}
