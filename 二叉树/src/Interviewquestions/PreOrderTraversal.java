package Interviewquestions;

import java.util.ArrayList;
import java.util.List;

/*
给定一个二叉树，返回它的前序遍历

    示例:
        输入: [1,null,2,3]
         1
          \
           2
          /
         3

        输出: [1,2,3]
*/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class PreOrderTraversal {
     public List<Integer> preOrderTraversal(TreeNode root) {
         List<Integer> result = new ArrayList<>();  //创建一个List
         if (root == null) {
             //如果是一个空树，则返回一个空链表，而不是null
             return result;
         }
         //访问根节点，把访问到的元素添加到result中
         result.add(root.val);
         //递归访问左子树
         // addAll：把参数中的集合里的所有元素都add到当前集合中
         result.addAll(preOrderTraversal(root.left));

         //递归访问右子树
         result.addAll(preOrderTraversal(root.right));

         return result;
     }
}
