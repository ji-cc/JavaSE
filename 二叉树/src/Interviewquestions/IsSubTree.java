package Interviewquestions;

/*给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。

     示例 1:
        给定的树 s:

                  3
                 / \
                4   5
               / \
              1   2
        给定的树 t：

                  4
                 / \
                1   2
        返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。

     示例 2:
        给定的树 s：

                  3
                 / \
                4   5
               / \
              1   2
                 /
                0
        给定的树 t：

                  4
                 / \
                1   2
        返回 false
        */

class Node {
    int val;
    Node left;
    Node right;
    Node() {

    }
    Node(int val) {
        this.val = val;
    }
    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class IsSubTree {
    //遍历s找到s中的每一个结点（每一个结点对应一个子树，判定当前子树和t是否相等
    public boolean isSubtree(Node s, Node t) {
        //先遍历s这个树，访问到某个结点时，“访问”操作就是isSaneTree类的判定
        if(s == null ) {
            return false;
        }

        //判定s中是否包含t => s和t是否相同 || s.left是否包含t || s.right是否包含t
        //访问当前结点
        return isSameTree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    private boolean isSameTree(Node p, Node q) {
        //如果都为空树，认为是相等的
        if (p == null && q == null) {
            return true;
        }

        //一个树为空，一个树非空，则认为不相等(此时if语句中p和q肯定不会同时为空)
        if (p == null || q == null ) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
