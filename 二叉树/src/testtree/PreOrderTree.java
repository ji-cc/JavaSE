package testtree;

public class PreOrderTree {
    public static BuildTree.Node root = BuildTree.build();

    //先序遍历：根节点-->左子树-->右子树
    public static void preOrder(BuildTree.Node root) {
        //如果是空树，不需要进行任何操作
        if (root == null) {
            return;
        }
        //先访问根节点
        System.out.print(root.val + " ");
        //递归处理左子树
        preOrder(root.left);
        //递归处理右子树
        preOrder(root.right);
    }
}
