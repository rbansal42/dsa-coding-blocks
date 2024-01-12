package Lec_25;

import java.util.LinkedList;
import java.util.Queue;

public class tree {
    node root;
    int preIndex = 0;

    public tree(int[] lvl, boolean b) {
        root = createLvl(lvl);
    }

    public tree() {

    }

    public void print() {
        print(root);
    }

    private void print(node nn) {
        if (nn == null) {
            return;
        }

        String str = "";
        if (nn.left != null) {
            str += nn.left.data;
        }
        str = str + "=>" + nn.data + "<=";

        if (nn.right != null) {
            str = str + nn.right.data;
        }

        print(nn.left);
        print(nn.right);
        System.out.println(str);
    }

    public void binaryTree(int[] pre, int[] in) {
        root = createInPre(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public node createInPre(int[] pre, int ps, int pe, int[] in, int is, int ie) {
        if (is > ie) {
            return null;
        }
        node nn = new node(pre[ps]);
        int f = -1;
        int leftSize = 0;
        for (int i = is; i <= ie; i++) {
            if (in[i] == nn.data) {
                f = i;
                break;
            }
            leftSize++;
        }
        nn.left = createInPre(pre, ps + 1, ps + leftSize, in, is, f - 1);
        nn.right = createInPre(pre, ps + leftSize + 1, pe, in, f + 1, ie);
        return nn;
    }

    public int size() {
        return size(root);
    }

    public int size(node nn) {
        if (nn == null) {
            return 0;
        }

        int l = size(nn.left);
        int r = size(nn.right);

        return l + r + 1;
    }

    public int height() {
        return height(root);
    }

    private int height(node nn) {

        if (nn == null) {
            return -1;
        }

        int left = height(nn.left);
        int right = height(nn.right);
        return Math.max(left, right) + 1;
    }

    public int maxDistanceFromRootToLeaf() {
        return maxDistanceFromRootToLeaf(root);
    }

    public int maxDistanceFromRootToLeaf(node nn) {
        if (nn == null) {
            return 0;
        }

        int max = Math.max(maxDistanceFromRootToLeaf(nn.left), maxDistanceFromRootToLeaf(nn.right));
        return max;
    }

    public int diameter() {
        return diameter(root);
    }

    private int diameter(node nn) {
        if (nn == null) {
            return 0;
        }

        int left = diameter(nn.left);
        int right = diameter(nn.right);

        int self = 2 + height(nn.left) + height(nn.right);

        return Math.max(self, Math.max(left, right));

    }

    public boolean isBalanced() {
        // Balanced = |height of right - height of left| // this condition should be satisfied at all nodes
        return isBalanced(root);
    }

    private boolean isBalanced(node nn) {

        return isBalanced2(nn).isBal;
    }

    private BalanceHeightPair isBalanced2(node nn) {
        if (nn == null) {
            return new BalanceHeightPair();
        }

        BalanceHeightPair L = isBalanced2(nn.left);
        BalanceHeightPair R = isBalanced2(nn.right);

        BalanceHeightPair ans = new BalanceHeightPair();
        ans.height = Math.max(L.height, R.height) + 1;

        boolean self = Math.abs(L.height - R.height) <= 1;

        ans.isBal = L.isBal && R.isBal && self;
        return ans;
    }

    public void binaryTreeFromPreAndNull(int[] pre) {
        root = createFromPreAndNull(pre);
    }

    public node createFromPreAndNull(int[] pre) {

        if (pre[preIndex] == -1 || preIndex >= pre.length) {

            preIndex++;
            return null;
        }

        node nn = new node(pre[preIndex]);
        preIndex++;
        nn.left = createFromPreAndNull(pre);
        nn.right = createFromPreAndNull(pre);

        return nn;

    }

    public void levelPrint() {
        Queue<node> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()) {
            node nn = Q.poll();
            System.out.println(nn.data);

            if (nn.left != null) {
                Q.add(nn.left);
            }
            if (nn.right != null) {
                Q.add(nn.right);
            }
        }
    }

    public void levelPrint2() {
        Queue<node> currQ = new LinkedList<>();
        Queue<node> nextQ = new LinkedList<>();

        currQ.add(root);
        while (!currQ.isEmpty()) {
            node nn = currQ.poll();
            System.out.println(nn.data);

            if (nn.left != null) {
                nextQ.add(nn.left);
            }
            if (nn.right != null) {
                nextQ.add(nn.right);
            }

            if (currQ.isEmpty()) {
                System.out.println();
                currQ = nextQ;
                nextQ = new LinkedList<>();
            }
        }
    }

    public void levelPrint3() {
        Queue<node> Q = new LinkedList<>();

        int currSize = 1;
        Q.add(root);
        while (!Q.isEmpty()) {
            for (int i = 0; i < currSize; i++) {
                node nn = Q.poll();
                System.out.println(nn.data + " ");

                if (nn.left != null) {
                    Q.add(nn.left);
                }
                if (nn.right != null) {
                    Q.add(nn.right);
                }
            }
            currSize = Q.size();
            System.out.println();
        }
    }

    private node createLvl(int[] lvl) {
        node nn = new node(lvl[0]);
        int idx = 1;

        Queue<node> Q = new LinkedList<>();
        Q.add(nn);

        while (!Q.isEmpty()) {
            node curr = Q.poll();

            if (lvl[idx] != -1 || idx >= lvl.length) {
                curr.left = new node(lvl[idx]);
                Q.add(nn.left);
            }
            idx++;

            if (idx >= lvl.length || lvl[idx] != -1) {
                curr.right = new node(lvl[idx]);
                Q.add(nn.right);
            }
            idx++;
        }

        return nn;
    }

    class BalanceHeightPair {
        int height = -1;
        boolean isBal = true;
    }

    class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
        }

    }

}
