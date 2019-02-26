public abstract class BinaryTreeHelper {
    public String serialize(BTNode head){
        return (head.getLeftChild()==null?"":serialize(head.getLeftChild())+
                head.getData() + "/" + head.getDepth() + ", " +
                (head.getRightChild()==null?"":serialize(head.getRightChild());
    }


    public BTNode deserialize(String s){
        String[] arr = s.split(", ");
        int prevDepth = Integer.getInteger(arr[0].substring(arr[0].length()-1));
        BTNode prevNode = new BTNode(null, null, null, arr[0].substring(0, arr[0].length()-1), prevDepth);
        for(int i = 1; i < arr.length; i++){
            //TODO Iterative part

        }
    }

}
