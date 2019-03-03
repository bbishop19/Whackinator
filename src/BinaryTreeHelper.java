import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public abstract class BinaryTreeHelper {
    public static String serialize(BTNode head){
        return (head.getData() + ", " +
                (head.getLeftChild()==null?"n, ":serialize(head.getLeftChild()))+
                (head.getRightChild()==null?"n, ":serialize(head.getRightChild())));
    }


    public static BTNode deserialize(LinkedList<String> arr){
        String s = arr.remove(0);
        if(s.equals("n")){
            return null;
        }
        BTNode head = new BTNode(null, null, s);
        head.setLeftChild(deserialize(arr));
        head.setRightChild(deserialize(arr));
        return head;
    }

}
