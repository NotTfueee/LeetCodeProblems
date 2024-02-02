package Recursion;

//File Created by -- > anuragbhatt
//Created On -- > 02/02/24,Friday

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {

    public static void main(String[] args) {

        System.out.println(sequentialDigits(100 , 300));

    }

    public static List<Integer> sequentialDigits(int low , int high)
    {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            int num = 0;

            for (int j = i; j <= 9; j++) {
                num = num * 10 + j;

                if (num >= low && num <= high) {
                    result.add(num);
                }

                if (num > high)break;
            }
        }

        return result;
    }

}
