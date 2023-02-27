package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        System.out.println(0);
        System.out.println(1);
        int p=1;
        for (int i=1;i<=lastFibonacci-2;i++){
            p*=i;
            System.out.println(p);
        }
    }
}
