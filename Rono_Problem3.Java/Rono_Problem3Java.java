package rono_problem3.java;

import java.util.Scanner;

public class Rono_Problem3Java {
public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(arraySum(arr, 0));

        if (num > 0) {
            System.out.println(findMaximum(arr, 0));
        }

        System.out.println(countEven(arr, 0));
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
        return arr[i] > max ? arr[i] : max;
    }

    public static int countEven(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }

        if (arr[i] % 2 == 0) {
            return 1 + countEven(arr, i + 1);
        }

        return countEven(arr, i + 1);
    }
}