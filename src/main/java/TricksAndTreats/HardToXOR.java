
package TricksAndTreats;

import java.util.Arrays;

public class HardToXOR {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 3, 7, 8};
        int missingNumber = findMissedNumber(nums);
        System.out.println("Отсутствующее число: " + missingNumber);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Начальный массив: " + Arrays.toString(arr));
        swap(arr, 1, 3);
        System.out.println("Массив после свапа: " + Arrays.toString(arr));
    }

    public static int findMissedNumber(int[] nums) {
        int n = nums.length + 1;
        int xor = 0;

        // Вычисляем XOR всех чисел от 1 до n
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        // Вычисляем XOR всех чисел в массиве
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }

        public static void swap(int[] arr, int i, int j) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
            //Так делать не надо, просто фича
        }
    }

