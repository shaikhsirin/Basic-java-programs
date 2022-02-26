import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        //Take User Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the No. of terms in series : ");
        int no_of_Terms = scanner.nextInt();

        double sum = 0.0;

        //calculate harmonic number
        for (int i = 1; i <= no_of_Terms; i++) {
            sum = sum + 1.0 / i;
        }

        //printing out the nth Harmonic number
        System.out.println("nth Harmonic Number having " + no_of_Terms + "terms is : ");
        System.out.println(sum);

        scanner.close();
    }
}
