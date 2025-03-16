import org.example.treehelper.TreeNode;

public class SymmetricTree {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        return nodesAreSymmetric(root.left, root.right);
    }
    public boolean nodesAreSymmetric(TreeNode rightNode, TreeNode leftTreeNode) {
        if (rightNode == null && leftTreeNode == null) return true;
        if (rightNode == null || leftTreeNode == null) return false;
        if (rightNode.val != leftTreeNode.val) return false;

        return nodesAreSymmetric(rightNode.right, leftTreeNode.left) && nodesAreSymmetric(rightNode.left, leftTreeNode.right);
    }
}
