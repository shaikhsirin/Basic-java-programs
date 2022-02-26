import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println("Before swaping the value of a and b are" + a + " and " + b);

        //a will be 30
        a = a + b;
        //b will be 10
        b = a - b;
        //a will be 20
        a = a - b;
        System.out.println("After swaping the value of a and b are" + a + " and " + b);

        //USing this We can swap 2 no. using 3rd variable.
        //int c;
        //c = a;
        //a = b;
        //b = c;

        sc.close();
    }

}
