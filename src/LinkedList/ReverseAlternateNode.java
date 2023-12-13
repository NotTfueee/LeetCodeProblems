package LinkedList;

//File Created by -- > anuragbhatt
//Created On -- > 06/10/23,Friday

public class ReverseAlternateNode {

    public static void main(String[] args) {

        Integer[] arr = {10,4,9,1,3,5,9,4};

        reverse(ListNode.constructList(arr));
    }

    public static void reverse(ListNode odd)
    {
        ListNode curr = odd , prev = odd , tail = odd;
        ListNode rev = null;

        int i = 1 ;
        while(curr != null)
        {
            if(i % 2 == 0 )
            {
                ListNode newNode = curr.next;
                curr.next = rev;
                rev = curr;
                curr = newNode;

                prev.next = newNode;
                prev = prev.next;
                i++;
                if(curr != null)tail = prev;
            }
            else
            {
                i++;
                curr = curr.next;
            }
        }

        tail.next = rev;

        ListNode.print(odd);
    }
}
