package testtree;

//求二叉树中叶子结点（没有子树的结点）的个数
//思路：1.左子树&&右子树都为null,说明为叶子结点
//      2.二叉树的叶子结点个数=左子树的叶子结点个数+右子树的叶子结点个数
public class LeafSize {
    /*         A
             /   \
            B     C
          /   \    \
         D     E    F
              /
             G                        */
    public static int leafSize(BuildTree.Node root) {
        if (root == null) {
            //如果为空树，说明没有叶子结点，返回0
            return 0;
        }

        //判断是否为叶子结点
        if (root.left == null && root.right == null) {
            //满足这两个条件，说明root是叶子结点
            return 1;
        }
        //求当前这个树的叶子结点个数=左子树叶子结点个数+右子树叶子结点个数
        //此处没有+1，原因是当前结点一定不是叶子结点
        return leafSize(root.left) + leafSize(root.right);
    }
}
