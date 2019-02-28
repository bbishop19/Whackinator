import java.util.ArrayList;
import java.util.Stack;

public abstract class BinaryTreeHelper {
    public String serialize(BTNode head){
        return (head.getData() + ", " +
                head.getLeftChild()==null?"n, ":serialize(head.getLeftChild())+
                (head.getRightChild()==null?"n, ":serialize(head.getRightChild());
    }


    public BTNode deserialize(ArrayList<String> arr){
        String s = arr.get(0);
        arr.remove(0);
        if(s=="n"){
            return null;
        }
        BTNode head = new BTNode(null, null, s);
        head.setLeftChild(deserialize(arr));
        head.setRightChild(deserialize(arr));
    }

}
