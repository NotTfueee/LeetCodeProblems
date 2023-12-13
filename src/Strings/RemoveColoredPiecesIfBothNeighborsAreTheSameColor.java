package Strings;

//File Created by -- > anuragbhatt
//Created On -- > 02/10/23,Monday

import java.util.Stack;

public class RemoveColoredPiecesIfBothNeighborsAreTheSameColor {

    public static void main(String[] args) {
        System.out.println(winnerOfGame("AAAABBBB"));
    }

    public static boolean winnerOfGame(String colors) {

        if (colors.length() < 3)return false;

        var stack = new Stack<Character>();

        int a = 0 , b = 0 ;

        for(int i = 0 ; i < colors.length(); ++i)
        {
            char item = colors.charAt(i);

            if(stack.isEmpty())
            {
                stack.push(item);
                continue;
            }

            if(stack.peek() == item)stack.push(item);
            else
            {
                if(stack.size() >= 3)
                {
                    if(stack.peek() == 'A')
                    {
                        a += stack.size() - 2;
                    }
                    else
                    {
                        b += stack.size() - 2;
                    }
                }

                stack.clear();
                stack.push(item);
            }
        }

        if(!stack.isEmpty() && stack.size() >= 3)
        {
            if(stack.peek() == 'A')a += stack.size()-2;
            else b += stack.size()-2;
        }

        if(a == b)return false;
        else return a > b;
    }
}
