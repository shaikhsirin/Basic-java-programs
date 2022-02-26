import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of a: ");
        int b = sc.nextInt();
        System.out.println("Enter value of a: ");
        int c = sc.nextInt();

        //using ternary operator
        int res = Math.max(a, b);

        int largest = Math.max(c, res);

        System.out.println("Largest among three num is " + largest);

        sc.close();

    }
}










