package Recursion;

//File Created by -- > anuragbhatt
//Created On -- > 16/11/23,Thursday

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FIndUniqueBinaryStrings {

    public static void main(String[] args) {

        String[] arr = {"111" , "001" , "011"};

        System.out.println(find(arr));
    }

    public static String find(String[] arr)
    {
        var set = new HashSet<String>(Arrays.asList(arr));

        var possible = new ArrayList<String>();

        allPossible(arr.length , possible , "");

        System.out.println(possible);

        for(String s : possible)
        {
            if(!set.contains(s))return s;
        }

        return "";
    }

    public static void allPossible(int n , ArrayList<String> possible , String s)
    {
        if(s.length() == n)
        {
            possible.add(s);
            return;
        }

        allPossible(n , possible , s+"0");
        allPossible(n , possible , s+"1");
    }
}
