//package Lec_09;
//
//public class binarySearch {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
//        find(arr);
//    }
//
//    public static int find(int[] arr, int toFind) {
//        int s = 0;
//        int e = arr.length - 1;
//        while (true) {
//            int mid = (s + e) / 2;
//            if (toFind == arr[mid]) {
//                return mid;
//            } else if (arr[mid] > toFind) {
//                e = mid - 1;
//            } else if (arr[mid] < toFind) {
//                s = mid + 1;
//            }
//        }
//    }
//}
