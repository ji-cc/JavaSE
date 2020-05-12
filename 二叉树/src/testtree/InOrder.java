package testtree;

public class InOrder {
    //中序遍历  根的左子树-->根节点-->根的右子树
    public static void inOrder(BuildTree.Node root) {
        if (root == null) {
            return;
        }
        //先递归处理左子树
        inOrder(root.left);
        //打印根节点
        System.out.print(root.val + " ");
        //递归处理右子树
        inOrder(root.right);
    }
}
