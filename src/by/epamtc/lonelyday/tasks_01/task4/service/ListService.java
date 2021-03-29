package by.epamtc.lonelyday.tasks_01.task4.service;

import java.util.List;

public class ListService {
    public static int countEven(List<Integer> data){
        int count = 0;
        for(int i : data){
            if(i%2 == 0)
                count++;
        }
        return count;
    }
}
