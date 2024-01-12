package Lec_24;

public class linkedList {
    node head;

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int size() {
        int size = 0;
        node temp = head;

        while (temp != null) {
            size++;
        }
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getDataAtIndex(int index) {
        node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int getDataAtHead() {
        return head.data;
    }

    public int getDataAtTail() {
        return getDataAtIndex(size() - 1);
    }

    public void addAtStart(int data) {
        node newNode = new node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtLast(int data) {
        node temp = new node(data);

        node last = getNodeAt(size() - 1);

        last.next = temp;
    }

    public void addAtIndex(int index, int data) {
        //  Initialising new node
        node temp = new node(data);

        // Finding nodes before and after the new node
        node prev = getNodeAt(index);
        node after = prev.next;

        // Updating nodes
        temp = after;
        prev.next = temp;
    }

    public int removeFirst() {
        int data = head.data;
        head = head.next;
        return data;
    }

    public int removeLast() {
        node last = getNodeAt(size() - 1);
        node secondLast = getNodeAt(size() - 2);

        secondLast.next = null;
        return last.data;
    }

    public int removeAt(int index) {

        node before = getNodeAt(index - 1);
        node curr = before.next;
        node after = curr.next;

        before.next = after;

        return curr.data;

    }

    public void reverse() {
        node current = head;
        node prev = null;
        node next = current.next;

        while (current != null) {
            node after = current.next;
            current.next = prev;
            prev = current;
            current = after;
        }
        head = prev;
    }

    public node reverseRecursively(node nn) {
        if (nn.next == null) {
            return nn;
        }
        node tail = reverseRecursively(nn.next);
        tail.next = nn;
        nn.next = null;
        return nn;
    }

    private node getNodeAt(int index) {
        node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }
}
