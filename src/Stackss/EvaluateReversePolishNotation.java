package Stackss;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args)
    {
        String[] a = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(polishNotation(a));
    }

    public static int polishNotation(String[] tokens)
    {
        Stack<String> stack = new Stack<>();

        for(int i = 0 ; i < tokens.length; i++)
        {
            String item = tokens[i];

            if(item.equals("/") || item .equals("*")  || item .equals("-")  || item .equals("+"))
            {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());

                String res = calculate(a,b,item);

                stack.push(res);
            }
            else
            {
                stack.push(item);
            }

        }

        System.out.println(stack);

        return Integer.parseInt(stack.peek());
    }

    public static String calculate(int a , int b , String item )
    {
        int ans = 0;
        if(item .equals("*"))ans = a *b;
        else if(item .equals("/"))ans = a/b;
        else if(item .equals("-"))ans = a-b;
        else ans = a+b;

        return Integer.toString(ans);
    }
}
