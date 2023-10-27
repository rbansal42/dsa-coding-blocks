package assignment2Questions;

import java.util.Scanner;

public class alexGoesShopping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Getting length of array
        int noOfItemsInShop = scan.nextInt();

        // creating array of the length
        int[] priceOfItem = new int[noOfItemsInShop];
        for (int i = 0; i < noOfItemsInShop; i++) {
            priceOfItem[i] = scan.nextInt();
        }

        int noOfQueries = scan.nextInt();


        for (int i = 0; i < noOfQueries; i++) {
            int moneyWithAlex = scan.nextInt();
            int shopkeeperClaim = scan.nextInt();
            int validItem = 0;

            for (int j = 0; j < noOfItemsInShop; j++) {
                if (moneyWithAlex % priceOfItem[j] == 0) {
                    validItem++;
                }
            }

            System.out.printf("Valid items are %d", validItem);
            if (shopkeeperClaim <= validItem) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
