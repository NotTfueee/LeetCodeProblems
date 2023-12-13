package Stackss;

import java.util.Stack;

public class ReverseAStack {

    public static void main (String [] args)
    {
        var stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        reverse(stack);
    }
    public static void reverse(Stack<Integer> s )
    {
        if(s.isEmpty())return;

        System.out.print(s.pop()+" ");
        reverse(s);

        return;
    }

}
