public class BTNode {
    private BTNode leftChild;
    private BTNode rightChild;
    private BTNode parent;
    private String data;
    private int depth;


    public BTNode(BTNode left, BTNode right, BTNode parent, String data, Integer depth){
        leftChild = left;
        rightChild = right;
        this.parent = parent;
        this.data = data;
        this.depth = depth;
    }

    public BTNode(){
        this(null, null, null, null, null);
    }

    public BTNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BTNode leftChild) {
        this.leftChild = leftChild;
    }

    public BTNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BTNode rightChild) {
        this.rightChild = rightChild;
    }

    public BTNode getParent() {
        return parent;
    }

    public void setParent(BTNode parent) {
        this.parent = parent;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }


}
