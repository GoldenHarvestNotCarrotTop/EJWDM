package by.epamtc.lonelyday.tasks_01.task5.service;

import java.util.List;

public class ListService {
    public static int sumListInt(List<Integer> list){
        int sum = 0;
        for(int i : list) {
            sum += i;
        }
        return sum;
    }
}
