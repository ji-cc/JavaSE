package Interviewquestions;

/*
给定一个二叉树，找出其最大深度。
二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
   说明: 叶子节点是指没有子节点的节点。
   示例：
      给定二叉树 [3,9,20,null,null,15,7]，
             3
            / \
           9  20
             /  \
            15   7
      返回它的最大深度:3
*/


public class MaxDepth {
    public int maxDepth(TreeNode root) {
        //求当前这个树的深度 == 1+max(左子树深度，右子树深度)
        if (root == null) {
            //如果为空树，返回0
            return 0;
        }
        if (root.left == null && root.right == null) {
            //如果只有一个根结点，返回1
            return 1;
        }
        //左子树的深度
        int leftDepth = maxDepth(root.left);
        //右子树的深度
        int rightDepth = maxDepth(root.right);

        return 1 + (Math.max(leftDepth,rightDepth));
    }
}
