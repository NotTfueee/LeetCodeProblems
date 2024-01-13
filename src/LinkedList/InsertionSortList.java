package LinkedList;

//File Created by -- > anuragbhatt
//Created On -- > 13/01/24,Saturday

public class InsertionSortList {

    public static void main(String[] args) {

    }

    public static ListNode insertionSortList(ListNode head)
    {
        //we first create a dummy node as the smallest node can be at any position it would make insertions between 2 nodes easier
        ListNode dummy = new ListNode(0 , head);

        /*
        we maintain 2 pointers prev and curr to check if the current node is smaller than the prev node or not if yes we would apply
        insertion sort and if not we would check the other 2 nodes
         */

        ListNode prev = head , curr = head.next;

        while(curr != null)
        {
            // meaning the list is sorted we just increment the prev and curr pointers
            if(curr.val > prev.val)
            {
                prev = curr;
                curr = curr.next;
                continue;
            }

            // if the list is not sorted meaning that prev is greater than the curr we would start from the beginning of the list
            ListNode temp = dummy;

            /*
            we will find the position at which the node that was smaller than the previous node will fit after iterating
            the list from the start
             */
            while(curr.val > temp.next.val)
            {
                temp = temp.next;
            }

            /*
            after the position is found we change the pointers of the nodes (we will make the prev node next point to the curr nodes
            next as it is greater than the current node and the current nodes next will point to temp nodes next which will be greater than
            the current node and the temp will be just smaller than the current node (the position will be temp --- > curr --> temp.next)
             */

            prev.next = curr.next;
            curr.next = temp.next;
            temp.next = curr;
            curr = prev.next;
        }

        return dummy.next;
    }
}
