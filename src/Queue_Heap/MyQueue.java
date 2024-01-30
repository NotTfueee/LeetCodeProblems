package Queue_Heap;

//File Created by -- > anuragbhatt
//Created On -- > 29/01/24,Monday

import java.util.Stack;

public class MyQueue {

    private final Stack<Integer> stack1;
    private final Stack<Integer> stack;
    public MyQueue()
    {
        stack1 = new Stack<>();
        stack = new Stack<>();
    }

    public void push(int x)
    {
        stack1.push(x);
    }

    public int pop()
    {
        if(stack.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack.push(stack1.pop());
            }

            return stack.pop();
        }
        else return stack.pop();
    }

    public int peek()
    {
        if(stack.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                stack.push(stack1.pop());
            }

            return stack.peek();
        }
        else return stack.peek();
    }

    public boolean empty()
    {
        if(stack.isEmpty() && stack1.empty())return true;
        else return false;
    }

    public static void main(String[] args) {

        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}
