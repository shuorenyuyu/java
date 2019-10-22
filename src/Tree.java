import java.util.ArrayList;
import java.util.Collections;

public class Tree {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(25);
        root.left = new TreeNode(15);
        root.right = new TreeNode(50);
        root.left.left =  new TreeNode(10);
        System.out.println(postorderTraversal(root));
    }

     static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    private static ArrayList<Integer> res;
    public static ArrayList<Integer> postorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        if(root == null) return res;
        helper(root);
        Collections.reverse(res);
        return res;
    }
    public static void helper(TreeNode root){
        res.add(root.val);
        if(root.right != null){
            helper(root.right);
        }

        if(root.left != null){
            helper(root.left);
        }
    }
}
