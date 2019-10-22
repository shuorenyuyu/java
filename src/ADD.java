
public class ADD {
    public static void main(String args[]) {

        ListNode x = new ListNode(1);
        ListNode l1 = x;
        l1.next = new ListNode(4);
        l1=l1.next;
        l1.next = new ListNode(5);
        l1=l1.next;

        ListNode y = new ListNode(9);
        ListNode l2 = y;
        l2.next = new ListNode(5);
        l2=l2.next;
        l2.next = new ListNode(7);
        l2=l2.next;
        l2.next = new ListNode(7);
        l2=l2.next;

        ListNode res = addTwoNumber(y,x);

        System.out.println(nodeToString(res));
    }
    public static String nodeToString(ListNode node){
        String res = "";
        while(node != null){
            res += Integer.toString(node.val);
            node = node.next;
        }
        return res;
    }
     static class ListNode {
        int val;
        ListNode next ;
        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode addTwoNumber(ListNode l1, ListNode l2){
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
            if(l1 != null || l2!= null || node.val >9){
                node.next = new ListNode(0);
                if(node.val > 9){
                    node.next.val = 1;
                    node.val -= 10;
                }
            }
            node = node.next;
        }
        return res;
    }

}
