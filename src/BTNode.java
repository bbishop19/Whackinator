public class BTNode {
    private BTNode leftChild;
    private BTNode rightChild;
    private String data;


    public BTNode(BTNode left, BTNode right, String data){
        leftChild = left;
        rightChild = right;
        this.data = data;
    }

    public BTNode(){
        this(null, null, null);
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


}
