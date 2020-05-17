package Interviewquestions;

/*
给定一个二叉树，检查它是否是镜像对称的。
   例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
         1
        / \
       2   2
      / \ / \
     3  4 4  3
   但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
         1
        / \
       2   2
        \   \
         3    3
*/

public class IsSymmetricTree {
    //判断一个树是否对称，主要看左右子树是否对称=>
    // 左右子树根节点值需要相等&&左子树.left和右子树.right是否对称&&左子树.right和右子树.left是否对称
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        //把判定root是否对称转换为判定root.left和root.right是否对称
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) { //同时为空已经判定过了，所以此时t1和t2肯定不会同时为空
            return false;
        }
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
