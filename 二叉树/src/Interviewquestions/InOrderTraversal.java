package Interviewquestions;

/*给定一个二叉树，返回它的中序 遍历。
      示例:
        输入: [1,null,2,3]
                  1
                   \
                    2
                   /
                  3
        输出: [1,3,2]
        */

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        //递归访问左子树
        result.addAll(inorderTraversal(root.left));

        //访问根节点，把访问到的元素添加到result中
        result.add(root.val);

        //递归访问右子树
        result.addAll(inorderTraversal(root.right));

        return result;
    }
}
