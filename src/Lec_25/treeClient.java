package Lec_25;

public class treeClient {
    public static void main(String[] args) {
        int[] pre = {10, 20, 40, 50, 30, 60, 80};
        int[] in = {40, 20, 50, 10, 30, 60, 80};

        tree bt = new tree();
        bt.binaryTree(pre, in);
//        bt.print();
        System.out.println(bt.size());
        System.out.println(bt.maxDistanceFromRootToLeaf());
    }


}
