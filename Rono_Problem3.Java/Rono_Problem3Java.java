
package rono_problem3.java;

import java.util.Scanner;

public class Rono_PRoblem3Java {
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        line = line.replace("{", "").replace("}", "").replace(" ", "");

        String[] nums = line.split(",");

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        if (arr.length > 0) {
            System.out.println();
            System.out.println(
                    + arraySum(arr, 0) + ", "
                    + findMaximum(arr, 0) + ", "
                    + countEven(arr, 0));
        }

        input.close();
    }

    public static int arraySum(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }

        return arr[i] + arraySum(arr, i + 1);
    }

    public static int findMaximum(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }

        int max = findMaximum(arr, i + 1);

        if (arr[i] > max) {
            return arr[i];
        } else {
            return max;
        }
    }

    public static int countEven(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }

        if (arr[i] % 2 == 0) {
            return 1 + countEven(arr, i + 1);
        } else {
            return countEven(arr, i + 1);
        }
    

    }
    
}
