package LinkedList;

//File Created by -- > anuragbhatt
//Created On -- > 08/10/23,Sunday

public class InsertInASortedList {

    public static void main(String[] args) {

        Integer [] arr = {1 ,14 ,19 ,31 ,42};

        System.out.println(sort(ListNode.constructList(arr) , 44));

    }

    public static ListNode sort(ListNode head , int key)
    {
        ListNode newNode = new ListNode(key);

        if(key <= head.val)
        {
            newNode.next = head;
            head = newNode;
            return head;
        }

        ListNode curr = head.next , prev = head;


        while(curr != null)
        {
            if(key <= curr.val)
            {
                newNode.next = curr;
                prev.next = newNode;
                prev = newNode;

                break;
            }

            prev = prev.next;
            curr = curr.next;
        }

        if(key > prev.val)prev.next = newNode;
        ListNode.print(head);
        return head;
    }
}
