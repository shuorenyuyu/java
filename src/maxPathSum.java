public class maxPathSum {
    private static int max = Integer.MIN_VALUE;
    public static void main(String args[]){
        TreeNode root = new TreeNode(-2);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(-3);

        helper(root);
        System.out.println(max);
    }

    public static int helper(TreeNode root){
        if(root == null) return  Integer.MIN_VALUE;
        int left = Math.max(0,helper(root.left));
        int right = Math.max(0,helper(root.right));
        max = Math.max(max,root.val+ Math.max(0,left)+Math.max(0,right));
        return root.val+Math.max(left,right);
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
