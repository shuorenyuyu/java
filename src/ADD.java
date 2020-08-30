/**
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class ADD{
    public static void main(String args[]){

        ListNode head1 = new ListNode(2);
        ListNode l1 = head1;
        head1.next = new ListNode(4);
        head1 = head1.next;
        head1.next = new ListNode(3);
        head1 = head1.next;

        ListNode head2 = new ListNode(5);
        ListNode l2 = head2;
        head2.next = new ListNode(6);
        head2 = head2.next;
        head2.next = new ListNode(4);
        head2 = head2.next;

        ListNode res = addTwoNumber(l1,l2);
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
    private static ListNode addTwoNumber(ListNode l1, ListNode l2){
        ListNode res = new ListNode(0);
        ListNode node = res;
        while(l1 != null || l2 != null){
            if(l1 != null){
                node.val += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                node.val += l2.val;
                l2 = l2.next;
            }
            if(l1 != null || l2 != null || node.val > 9){
                node.next = new ListNode(0);
                if( node.val > 9){
                    node.val -= 10;
                    node.next.val += 1;
                }
            }
            node = node.next;
        }
        return  res;
    }
   static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
   }

}