package LinkedList;

//File Created by -- > anuragbhatt
//Created On -- > 16/12/23,Saturday

public class IntersectionOfTwoSortedLinkedLists {

    public static void main(String[] args) {
        Integer[] root1 = {1,2,3,4,6};
        Integer[] root2 = {2,4,6,8};

        ListNode.print(findIntersection(ListNode.constructList(root1) , ListNode.constructList(root2)));
    }

    public static ListNode findIntersection(ListNode head1 , ListNode head2)
    {
        ListNode curr1 = head1 , curr2 = head2;

        ListNode ans = new ListNode(-1) , prev = ans;
        while(curr1 != null && curr2 != null)
        {
            if(curr1.val == curr2.val)
            {
                prev.next = new ListNode(curr1.val);
                prev = prev.next;
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            else if(curr1.val != curr2.val)
            {
                if(curr1.val < curr2.val)curr1 = curr1.next;
                else curr2 = curr2.next;
            }
        }

        return ans.next;
    }
}
