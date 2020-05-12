package testtree;

//在一个二叉树中，查找某个值是否存在
//思路：先查看根节点是不是要查找的元素，再递归在左子树中查找，若没找到，再递归找右子树
public class Find {
    //返回值表示查找到的结点结果，没找到返回null;
    public static Character find(BuildTree.Node root, char toFind) {
        if (root == null) {
            return null;
        }
        //先查看根节点
        if (root.val == toFind) {
            return root.val;
        }
        Character result = null;
        //递归找左子树
        result = find (root.left, toFind);
        if (result != null) {
            //左子树中找到了，直接返回
            return result;
        }
        //左子树中未找到，递归找右子树
        return find(root.right, toFind);

    }
}
