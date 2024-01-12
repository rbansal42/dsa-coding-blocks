package assignment2Questions;

import java.util.Scanner;

public class murthalParantha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int paranthas = scan.nextInt();
        int noOfCooks = scan.nextInt();

        int[] cooks = new int[noOfCooks];
        for (int i = 0; i < noOfCooks; i++) {
            cooks[i] = scan.nextInt();
        }

        int currentTime = 1; // currentTime in mins
        while (!cookOutput(paranthas, cooks, currentTime)) {
            currentTime++;
        }

        System.out.println(currentTime);
    }

    public static boolean cookOutput(int paranthas, int[] cooks, int totalTime) {
        int totalParanthasReady = 0;

        for (int cook : cooks) {

            int time = 0;
            int paranthasMadeByThisCook = 1;

            while (true) {
                int timeToMakeParantha = paranthasMadeByThisCook * cook;

                if (time + timeToMakeParantha <= totalTime) {
                    time = time + timeToMakeParantha;
                    paranthasMadeByThisCook++;
                    totalParanthasReady++;
                } else {
                    break;
                }
            }
        }
        return totalParanthasReady >= paranthas;
    }
}