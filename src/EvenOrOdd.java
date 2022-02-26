import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking a number as a user input
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        //checking number is odd or even
        if(num % 2 == 0)
            System.out.println(num + "is even");
        else
            System.out.println(num + "is odd");

        sc.close();
    }
}
