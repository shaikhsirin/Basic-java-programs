public class FlipCoin {
    public static void main(String args[] ) {

        //taking element from argument array
        int num_of_flips = Integer.parseInt(args[0]);

        //checking number of flips is greater than 0 or not
        if(num_of_flips <= 0) {
            System.out.println("Value should be greater than 0");
            return;
        }

        //variables
        int head = 0;
        int tail = 0;
        int total_flips = num_of_flips;

        //counting heads and tails outcome till loop continues
        while(num_of_flips > 0) {
            double flip_var = Math.random();
            if(flip_var < 0.5) {
                tail++;
            }
            else {
                head++;
            }
            num_of_flips--;
        }

        //calculating percentages of heads and tails
        double head_perc = head / (double) total_flips * 100;;
        double tail_perc = tail / (double) total_flips * 100;;

        System.out.println("Head Percentage is : " + head_perc + "%");
        System.out.println("Tail Percentage is : " + tail_perc + "%");
    }
}
