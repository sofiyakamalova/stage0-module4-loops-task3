package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum=0;
        int n=0;
        for (int i=0;i<lengthOfLastNumber;i++){
            n+=9*Math.pow(10,i);
            sum+=n;
        }
        System.out.println(sum);
    }
}
