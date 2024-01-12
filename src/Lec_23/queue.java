package Lec_23;

public class queue {
    int[] arr;
    int front;
    int size;

    public queue() {
        this(5);
    }

    public queue(int capacity) {
        arr = new int[capacity];
        front = 0;
        size = 0;
    }

    public void add(int x) {
        int index = (front + size) % arr.length;
        arr[index] = x;
        size++;
    }

    public int poll() {
        int ans = arr[front];

        front++;
        size--;

        return ans;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int peek() {
        return arr[front];
    }

    public void print() {
        System.out.printf("[");
        int i = 0;
        for (; ; ) {
            if (i < size - 1) {
                System.out.printf("%d, ", arr[i]);
            } else if (i == size - 1) {
                System.out.printf("%d", arr[i]);
            } else {
                System.out.printf("]");
                break;
            }
            i++;
        }
    }

    public void reverse() {
        stack s = new stack(size);
        while (!isEmpty()) {
            s.add(poll());
        }
        while (!s.isEmpty()) {
            add(s.pop());
        }
    }
}
