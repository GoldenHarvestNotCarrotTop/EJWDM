package by.training.lonelyday.tasks_01.task5.service;

import java.util.ArrayList;
import java.util.List;

public class IntService {
    public static List<Integer> getDivisorsList(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int div = 1; div < ((int) Math.sqrt(n) + 1); div++) {
            if (n % div == 0) {
                divisors.add(div);

                if (n / div != div)         // test if not sqrt(n)
                    divisors.add(n / div);
            }

        }
        return divisors;
    }


    public static boolean isPerfect(int n) {
        if (n <= 0)
            return false;
        List<Integer> divisors = IntService.getDivisorsList(n);

        int sum = ListService.sumListInt(divisors);
        sum -= n;

        return sum == n;
    }
}
