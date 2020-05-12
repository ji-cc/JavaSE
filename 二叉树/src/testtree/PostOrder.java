package testtree;

public class PostOrder {
    /*         A
             /   \
            B      C
          /   \     \
         D     E     F
              /
             G                        */
    //后序遍历  根的左子树-->根的右子树-->根节点
    public static void postOrder(BuildTree.Node root) {
        //如果是空树，不需要进行任何操作
        if (root == null) {
            return;
        }
        //递归处理左子树
        postOrder(root.left);
        //递归处理右子树
        postOrder(root.right);
        //访问根节点
        System.out.print(root.val + " ");
    }
}
