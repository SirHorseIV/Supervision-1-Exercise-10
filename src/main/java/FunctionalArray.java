public class FunctionalArray {
    private int size;
    private BinaryTreeNode head;

    FunctionalArray(int size) {
        this.size = size;
        if (size == 0) {
            head = null;
            return;
        }
        head = new BinaryTreeNode(0);
        for (int i = 1; i < size; i++) {
            addItem(i);
        }
    }

    private int greatestBit(int n) {
        int bit = 1;
        while (n != 1) {
            n >>= 1;
            bit <<= 1;
        }
        return bit;
    }

    private void addItem(int index) {
        index++;
        int greatestBit = greatestBit(index);
        int parentIndex = index - greatestBit | (greatestBit >> 1);
        BinaryTreeNode node = traverse(parentIndex - 1);
        if ((index & (greatestBit >> 1)) == 0) {
            node.setLeft(new BinaryTreeNode(0));
        } else {
            node.setRight(new BinaryTreeNode(0));
        }
    }

    private BinaryTreeNode traverse(int index) {
        index++;
        if (index <= 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
        BinaryTreeNode node = head;
        while (index != 1) {
            if ((index & 1) == 0) {
                node = node.getLeft();
            } else {
                node = node.getRight();
            }
            index >>= 1;
        }
        return node;
    }

    int get(int index) {
        BinaryTreeNode node = traverse(index);
        return node.getValue();
    }

    void set(int index, int value) {
        BinaryTreeNode node = traverse(index);
        node.setValue(value);
    }
}
