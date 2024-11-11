public class SearchSet {
    private int elements;
    private BinaryTreeNode head;

    SearchSet() {}
    void insert(int value) {
        if (head == null) {
            head = new BinaryTreeNode(value);
            elements++;
            return;
        }
        recursiveInsert(head, value);
    }

    private void recursiveInsert(BinaryTreeNode node, int value) {
        int nodeValue = node.getValue();
        if (value < nodeValue) {
            BinaryTreeNode leftNode = node.getLeft();
            if (leftNode == null) {
                node.setLeft(new BinaryTreeNode(value));
                elements++;
            } else {
                recursiveInsert(leftNode, value);
            }
        }
        else if (nodeValue < value) {
            BinaryTreeNode rightNode = node.getRight();
            if (rightNode == null) {
                node.setRight(new BinaryTreeNode(value));
                elements++;
            } else {
                recursiveInsert(rightNode, value);
            }
        }
    }

    int getNumberElements() { return elements; }

    boolean contains(int value) {
        BinaryTreeNode node = head;
        while (node != null) {
            int nodeValue = node.getValue();
            if (value < nodeValue) {
                node = node.getLeft();
            } else if (nodeValue < value) {
                node = node.getRight();
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
