import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //take user input
        System.out.println("Enter the number to find Prime Factors: ");
        int n = sc.nextInt();

        System.out.println("The prime factors of " + n + " is ");

        //checking the factors of 2
        while (n%2==0)
        {
            System.out.print(2 + " ");
            n = n/2;
        }

        //print the factor of number other than 2
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n = n/i;
            }
        }

        if (n > 2)
            System.out.print(n);

        sc.close();
    }
}



