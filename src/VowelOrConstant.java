import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.println("Enter Alphabet between a-z : ");
        char vowel = sc.next().charAt(0);

        //checking alpabhet is vowel or consonant
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");

        sc.close();
    }
}


