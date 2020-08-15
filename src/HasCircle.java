
public class HasCircle {
    public static void main(String args[]) {
        ListNode node = new ListNode(0);
        ListNode dummy = node;
        for(int i=1; i<10;i++){
            node.next = new ListNode(i);
            node = node.next;
        }
        node.next = dummy;
        System.out.print(circle(dummy));
    }
     static class ListNode {
        int val;
      ListNode next = null;
      ListNode(int val) {
           this.val = val;
        }
    }
   public static boolean circle(ListNode dummy){
        ListNode fast = dummy.next;
        ListNode slow = dummy;
        while(fast != slow){
            if(fast == null || fast.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
   }
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
}
