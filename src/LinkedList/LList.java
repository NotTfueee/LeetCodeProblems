package LinkedList;

public class LList {

    public static class ListNode
    {
        int val;
        ListNode next;
    }

    public static class LinkedList
    {
        ListNode head;
        ListNode tail;
        int size;


        void printList()
        {
            ListNode curr = head;
            while(curr != null)
            {
                System.out.print(curr.val+"--> ");
                curr = curr.next;
            }
            System.out.println("null");
        }

        void addLast(int val)
        {
            ListNode newNode = new ListNode();
            newNode.val = val;
            newNode.next = null;
            if(size == 0 )
            {
                head = tail = newNode;
            }
            else
            {
                tail.next = newNode;
                tail = newNode;
            }

            size++;
        }

        void removeFirst()
        {
            if(size == 0 )
            {
                System.out.println("LinkedList is empty");
            }
            else if(size == 1)
            {
                head = tail = null;

            }
            else {
                head = head.next;
            }
            size--;
        }

        int getLast()
        {
            if(size == 0)
            {
                System.out.println("The Linked List is empty ");
                return -1;
            }
            return tail.val;
        }

        int getFirst()
        {
            if(size == 0 )
            {
                System.out.println("The LinkedList is Empty");
                return -1 ;
            }
            return head.val;
        }

        int getIndex(int index)
        {
            if(size == 0)
            {
                System.out.println("The LinkedList is Empty");
                return -1;
            }
            else if(index < 0 || index >= size)
            {
                System.out.println("The index is invalid");
                return -1;
            }
            ListNode curr = head;
            int i = 0;

            while(i < index && curr != null)
            {
                curr = curr.next;
                i++;
            }

            return curr.val;
        }

        public void addFirst(int val)
        {
            ListNode newNode = new ListNode();
            newNode.val = val;
            newNode.next = null;
            if(size == 0 )
            {
                head = tail = newNode;
            }
            else
            {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        public void addAtIndex(int index , int val)
        {
            ListNode newNode = new ListNode();
            newNode.val = val;
            newNode.next = null;

            if(size == 0 )
            {
                System.out.println("the LinkedList is Empty adding as the head");
                head = tail = newNode;
            }
            else if(index < 0 || index >= size)
            {
                System.out.println("Please Enter a vaild index ");
            }
            else
            {
                ListNode curr = head;
                int i = 0 ;
                while(i < index-1 )
                {
                    curr = curr.next;
                    i++;
                }

                newNode.next = curr.next;
                curr.next = newNode;
            }

            size++;
        }

        public void removeLast()
        {
            if(size == 0)
            {
                System.out.println("The LinkedList Is Empty");
                return ;
            }
            else if(size == 1)
            {
                head = tail = null;
            }
            else
            {

                ListNode curr = head;
                int i = 0;

                while(i < size-2)
                {
                    curr = curr.next;
                    i ++;
                }
                curr.next = null;
                tail = curr;
            }
            size--;
        }

        public void removeAtIndex(int index)
        {
            if(index >= size || index < 0)
            {
                System.out.println("The Index is Invalid");
                return;
            }
            else if (index == 0 )
            {
                removeFirst();
                size++;
            }
            else if(index == size-1) {
                removeLast();
                size++;
            }
            else {

                ListNode curr = head;
                int i = 0;

                while(i < index-1)
                {
                    curr = curr.next;
                    i++;
                }

                curr.next = curr.next.next;
            }

            size--;
        }

    }


    public static void main (String[] args)
    {
        LinkedList root = new LinkedList();
        root.addLast(10);
        root.addLast(30);
        root.addLast(40);
        root.addFirst(1);
        root.addAtIndex(3,15);

//        System.out.println("current tail is = "+root.tail.val + " current size is = "+root.size);
//        root.printList();
//
//        root.removeLast();
//        System.out.println("current tail is = " + root.tail.val);
        root.printList();
        System.out.println(root.size);

        root.removeAtIndex(3);
        System.out.println(root.size);
        root.removeAtIndex(0);
        System.out.println(root.size);
        root.removeAtIndex(2);
        root.printList();
    }

}
