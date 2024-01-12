package Lec_25;

public class bst {
    node root;

    public boolean find(int ali) {
        return find(root, ali);
    }

    private boolean find(node nn, int ali) {

        if (nn.data == ali) {
            return true;
        } else if (nn.data < ali) {
            find(nn.left, ali);
        } else if (nn.data > ali) {
            find(nn.right, ali);
        }

        return false;
    }

    public int min() {
        return min(root);
    }

    private int min(node nn) {
        if (nn.left == null) {
            return nn.data;
        }
        return min(nn.left);
    }

    public int max() {
        return max(this.root);
    }

    private int max(node nn) {
        if (nn.right == null) {
            return nn.data;
        }
        return max(nn.right);
    }

    public boolean isBST() {
        return isBST(root);
    }

    private boolean isBST(node nn) {

        boolean L = isBST(nn.left);
        boolean R = isBST(nn.right);

        boolean self = max(nn.left) < nn.data && min(nn.right) > nn.data;

        return L && R && self;
    }

    public void add(int ali) {
        root = add(root, ali);
    }

    public node add(node nn, int ali) {
        if (nn == null) {
            return new node(ali);
        }

        if (nn.data < ali) {
            nn.right = add(nn.right, ali);
        } else {
            nn.left = add(nn.left, ali);
        }

        return nn;
    }

    public void remove(int ali) {
        root = remove(root, ali);
    }

    private node remove(node nn, int ali) {
        if (nn == null) {
            return null;
        }
        if (nn.data < ali) {
            nn.right = remove(nn.right, ali);
        } else if (nn.data > ali) {
            nn.left = remove(nn.left, ali);
        } else {
            if (nn.left == null && nn.right == null) {
                return null;
            } else if (nn.left == null && nn.right != null) {
                return nn.right;
            } else if (nn.left != null && nn.right == null) {
                return nn.left;
            } else {
                // replace nn with --> max of left subtree ||OR|| min of right subtree

                nn.data = min(nn.right);
                nn.right = remove(nn.right, nn.data);
                return nn;

            }
        }
        return nn;
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
