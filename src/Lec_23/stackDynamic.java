package Lec_23;

public class stackDynamic extends stack {
    @Override
    public void add(int ali) {
        if (isFull()) {
            grow();
        }
        super.add(ali);
    }

    public void grow() {
        int[] biggy = new int[arr.length * 2];
        for (int i = 0; i <= top; i++) {
            biggy[i] = arr[i];
        }
        arr = biggy;
    }
}
