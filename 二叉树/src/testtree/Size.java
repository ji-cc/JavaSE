package testtree;
//给定一个二叉树，求二叉树中的结点个数
public class Size {

    public static int size(BuildTree.Node root) {
        if (root == null) {
            return 0; //空树里有0个结点
        }
        /*      A
              /   \
             B     C
           /   \     \
          D     E     F
               /
              G                        */
        //整个树的结点个数=根节点个数          +          左子树节点个数                 +                      右子树节点个数
        //                     1   +     (B这个树的根节点+B的左子树节点个数+B的右子树结点个数)   +  (C这个树的根节点+C的左子树节点个数+C的右子树结点个数)
        return 1 + size(root.left)  + size(root.right);
    }
}
