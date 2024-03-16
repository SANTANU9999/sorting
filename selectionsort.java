package Sorting;

import java.util.*;

public class selectionsort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSorted array is"); 
        for (int i = 0; i < arr.length - 1; i++) {
            int s = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[s]) {
                    s = j;
                }
            }
            int temp = arr[s];
            arr[s] = arr[i];
            arr[i] = temp;

        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
