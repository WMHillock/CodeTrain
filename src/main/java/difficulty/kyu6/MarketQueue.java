package difficulty.kyu6;
/**
 * There is a queue for the self-checkout tills at the supermarket.
 * Your task is write a function to calculate the total time required for all the customers to check out!
 *
 * input
 * customers: an array of positive integers representing the queue.
 * Each integer represents a customer, and its value is the amount of time they require to check out.
 * n: a positive integer, the number of checkout tills.
 * output
 * The function should return an integer, the total time required.
 */

import java.util.Arrays;

public class MarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] checkoutTimes = new int[n];

        Arrays.stream(customers)
                .forEach(client -> {
                    int minTime = Arrays.stream(checkoutTimes).min().getAsInt();
                    int index = indexOf(checkoutTimes, minTime);
                    checkoutTimes[index] += client;
                });

        return Arrays.stream(checkoutTimes).max().getAsInt();
    }

    private static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
