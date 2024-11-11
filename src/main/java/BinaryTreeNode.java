public class BinaryTreeNode {
    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    BinaryTreeNode(int value) { this.value = value; }

    int getValue() { return value; }
    void setValue(int value) { this.value = value; }

    BinaryTreeNode getLeft() { return left; }
    void setLeft(BinaryTreeNode left) { this.left = left; }
    BinaryTreeNode getRight() { return right; }
    void setRight(BinaryTreeNode right) { this.right = right; }
}
