import java.util.Scanner;

public class Distance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Taking value of x and y coordinates from user
        System.out.println("Enter x co-ordinate :");
        int x = sc.nextInt();
        System.out.println("Enter y co-ordinate :");
        int y = sc.nextInt();

        //calculating distance
        double distance = (double) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("The distance between (0,0) and (x,y) is " + distance);

        sc.close();
    }
}


