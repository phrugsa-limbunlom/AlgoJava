package binaryTree;

public class BinaryTree {

    Node root;

    public void addNode (int value){
        root = insertElement(root,value);
    }

    public boolean containNode(int value){
        return findElement(root,value);
    }

    private static boolean findElement(Node current,int value){
        if(current == null) {
            return false;
        }

        if(current.value == value) {
            return true;
        }
        else if(value > current.value) {
            return findElement(current.right, value);
        }
        else {
            return findElement(current.left, value);
        }

    }
    private static Node insertElement(Node current, int value){

        if(current == null) {
            return new Node(value);
        }else if(value < current.value){
            current.left = insertElement(current.left,value);
        }else if(value > current.value){
            current.right = insertElement(current.right, value);
        }else{
            return current;
        }
        return current;
    }
}
