package Interviewquestions;

/*
给定一个二叉树，判断它是否是高度平衡的二叉树。
本题中，一棵高度平衡二叉树定义为：一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
   示例 1:
       给定二叉树 [3,9,20,null,null,15,7]
                   3
                  / \
                 9  20
                   /  \
                  15   7
       返回 true
   示例 2:
        给定二叉树 [1,2,2,3,3,null,null,4,4]
                    1
                   / \
                  2   2
                 / \
                3   3
               / \
              4   4
        返回 false
 */

public class IsBalancedTree {
    //依次遍历每个结点，求这个结点的左右子树的高度，然后计算差值，看这个差值是否符合要求
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }

        //求当前左右子树的深度
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        //当前这个树平衡 => 当前结点左右子树高度差<=1 && 左子树平衡 &&右子树平衡
        return ((Math.abs(leftDepth-rightDepth)) <= 1) && isBalanced(root.left) && (isBalanced(root.right));
    }

    private int maxDepth(TreeNode root) {
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
