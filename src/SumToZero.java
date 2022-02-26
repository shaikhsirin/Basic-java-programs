public class SumToZero {
    //defined a 1D array
    static final int[] arr = {-7, 3, 4, 5};

    //main method
    public static void main(String[] args) {

        //gives the count of distinct triplets
        int count = 0;

        System.out.println("The triplets are :");

        //iterate the array 3 times
        for(int i=0; i < arr.length-2; i++) {
            for(int j=i+1; j < arr.length-1; j++) {
                for(int k=i+2; k < arr.length; k++) {

                    //checking sum of 3 number is 0 or not
                    if(arr[i]+arr[j]+arr[k] == 0) {
                        System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);
                        System.out.print("\n");
                        count++;
                    }

                }
            }
        }

        if (count == 0)
            System.out.println("Not triplets exist in array whose sum is zero");
        else
            System.out.println("Number of distint triplets with sum zero is " + count);
    }
}
