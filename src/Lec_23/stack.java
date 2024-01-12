package Lec_23;

public class stack {
    int[] arr;
    int top;

    public stack() {
        this(5);
    }

    public stack(int capacity) {
        arr = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public int size() {
        return top + 1;
    }

    public void add(int x) {
        if (isFull()) {
            throw new RuntimeException("Bhai aur nahi lunga.");
        }
        top++;
        arr[top] = x;
    }

    public int peek() {
        return arr[top];
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Bhai kya nikaal rha hai");
        }
        int ans = arr[top];
        top--;
        return ans;
    }

    public void print() {
        System.out.printf("[");
        int i = 0;
        for (; ; ) {
            if (i < top) {
                System.out.printf("%d, ", arr[i]);
            } else if (i == top) {
                System.out.printf("%d", arr[i]);
            } else {
                System.out.printf("]");
                break;
            }
            i++;
        }
    }

    public void reverse() {
        stack s1 = new stack();
        while (!isEmpty()) {
            s1.add(pop());
        }

        stack s2 = new stack();
        while (!s1.isEmpty()) {
            s2.add(s1.pop());
        }

        while (!s2.isEmpty()) {
            add(s2.pop());
        }
    }
}
