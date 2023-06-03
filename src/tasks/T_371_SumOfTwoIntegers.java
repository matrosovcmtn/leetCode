package tasks;

import java.util.ArrayList;
import java.util.List;

public class T_371_SumOfTwoIntegers {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(climbStairs(n));
    }

    private static int climbStairs(int n) {
        if (n == 0) return 0;
        List<Integer> dp = new ArrayList<>();
        dp.add(1);
        dp.add(2);
        for (int i = 2; i < n; i++) {
            dp.add(dp.get(i-1) + dp.get(i-2));
        }
        return dp.get(n-1);
    }
}
