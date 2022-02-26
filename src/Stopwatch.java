public class Stopwatch {
    public static void main(String[] args) {

        //print current time(start of program)
        double start = System.currentTimeMillis();
        System.out.println("Start time is " + start);
        int c = 0;
        for (int i=0; i<1000; i++) {
            c += i;
        }

        //print current time(end of program)
        double stop = System.currentTimeMillis();
        System.out.println("End time is " + start);

        double elapsed = start-stop;
        System.out.println("Time Elapsed : " + elapsed);
    }
}
