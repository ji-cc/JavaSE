package testtree;

import javafx.geometry.Pos;

public class Main {
    public static void main(String[] args) {
        BuildTree.Node root = BuildTree.build();
        /*     A
             /   \
            B     C
          /   \    \
         D     E    F
              /
             G                        */
        //先序遍历结果测试   A B D E G C F
        PreOrderTree.preOrder(root);

        System.out.println();

        //中序遍历结果测试    D B G E A C F
        InOrder.inOrder(root);

        System.out.println();

        //后序遍历结果测试   D G E B F C A
        PostOrder.postOrder(root);
        System.out.println();

        System.out.println(Size.size(root));   //7

        System.out.println(LeafSize.leafSize(root));

        System.out.println(K_LevelSize.kLevelSize(root, 5));

        System.out.println(Find.find(root,'A'));

    }


}
