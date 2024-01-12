package Lec_25;

public class tree {
    node root;

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
        return isBalanced();
    }

    private boolean isBalanced(node nn) {

        boolean l = isBalanced(nn.left);
        boolean r = isBalanced(nn.right);
        boolean self = Math.abs(height(nn.left) - height(nn.right)) <= 1;

        return l && r && self;
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
