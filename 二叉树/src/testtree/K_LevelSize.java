package testtree;
/*             A
             /   \
            B     C
          /   \    \
         D     E    F
              /
             G                        */
//求树的第k层结点的个数
//k==1,结点个数=1
//求树的第k层结点个数 = 左子树的k-1层结点个数  +  右子树的k-1层结点个数
// A的第三层结点个数  =   B的第二层结点个数    +  C的第二层结点个数
public class K_LevelSize {
    public static int kLevelSize(BuildTree.Node root, int k) {
        //如果k为不合法数字或树为空树，返回0
        if (root == null || k < 1) {
            return 0;
        }

        if (k == 1) {
           // 第一层结点个数
            return 1;
        }
        //把问题进一步拆分
        //求树的第k层结点个数 = 左子树的k-1层结点个数  +  右子树的k-1层结点个数
        return kLevelSize(root.left, k-1) + kLevelSize(root.right, k-1);
    }
}
