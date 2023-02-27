package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = second;
        int count = 0;

        if(first > second){
            max = first;
        }

        for(int i = 2; i <= max; i++){
            if(first%i==0 && second%i==0){
                count = i;
            }
        }
        System.out.println(count);
    }
}
