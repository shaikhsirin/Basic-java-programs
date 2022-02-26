import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int rev = 0;

        while(num != 0) {
            int remain = num % 10;
            rev = rev * 10 + remain;
            num /= 10;
        }

        System.out.println("Reversed Number: " + rev);

        sc.close();
    }
}
