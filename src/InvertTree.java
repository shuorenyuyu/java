import java.util.ArrayList;

public class InvertTree {
    private static ArrayList<Integer> list;
    public static void main(String args[]){
         TreeNode root = new TreeNode(5);
         root.left = new TreeNode(3);
         root.right = new TreeNode(-1);
         list = new ArrayList<>();
         root = invert(root);
         inorder(root);
         System.out.println(list);

    }
    public static void inorder(TreeNode root){
        if(root.left != null){
            inorder(root.left);
        }
        list.add(root.val);
        if(root.right != null){
            inorder(root.right);
        }
    }
    public static TreeNode invert(TreeNode root){
        if(root == null) return null;
        TreeNode left = invert(root.left);
        TreeNode right = invert(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
}
