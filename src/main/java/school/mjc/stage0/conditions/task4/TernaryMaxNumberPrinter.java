package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max = first;
        max = second > max ? second : max;
        max = third > max ? third : max;
        System.out.println(max);
    }
}
