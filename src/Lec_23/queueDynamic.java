package Lec_23;

public class queueDynamic extends queue {
    @Override
    public void add(int ali) {
        if (isFull()) {
            grow();
        }
        super.add(ali);
    }

    public void grow() {
        int[] biggy = new int[arr.length * 2];
        for (int i = 0; i <= arr.length; i++) {
            biggy[i] = arr[i];
        }
        arr = biggy;
    }
}
