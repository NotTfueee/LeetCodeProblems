package Stackss;

import java.util.Stack;

public class ValidParentheses {

    public static void main (String [] args)
    {
        System.out.println(valid("(])"));
    }

    public static boolean valid(String s)
    {

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ; i ++)
        {
            char item = s.charAt(i);

            if((item == ')' || item == ']' || item == '}') && !stack.isEmpty())
            {
                String valid = stack.peek()+""+item;

                if(valid.equals("()")||valid.equals("[]")||valid.equals("{}"))
                {
                    stack.pop();
                }
                else stack.push(item);

            }
            else stack.push(item);

        }

        return stack.size() > 0 ? false : true;
    }
}
