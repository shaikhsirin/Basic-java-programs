import java.util.Scanner;

public class TableOfPower {
    public static void main(String[] args){

        int num_val;
        int power = 2;

        //Take user input
        System.out.println("Enter an number: ");
        Scanner sc = new Scanner(System.in);
        num_val = sc.nextInt();

        //printing table of power of 2
        for(int i=0; i<=num_val; i++) {
            if(i==0) {
                System.out.println("2^" + i + " = " + 1);
            }
            else {
                System.out.println("2^" + i + " = " + power);
                power=2*power;
            }
        }

        sc.close();
    }
}
