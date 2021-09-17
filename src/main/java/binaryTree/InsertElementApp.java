package binaryTree;

public class InsertElementApp {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 5, 6};

        BinaryTree bt = new BinaryTree();

        for (int i : arr) {
            bt.addNode(i);
        }

        System.out.println(bt.containNode(1));
        System.out.println(bt.containNode(-1));

        for (int i : arr) {
            System.out.println(bt.containNode(i));
        }
    }
}
