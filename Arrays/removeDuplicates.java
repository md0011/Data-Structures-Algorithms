/*
Sample input
7
1 2 5 5 2 6 7
Sample output
1 2 5 6 7
*/

import java.util.*;

public class removeDuplicates {
    public static int RemoveDuplicates(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;// for next element
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        int n = sc.nextInt();
        System.out.print("Enter all the elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int newlength = RemoveDuplicates(arr, n);
        System.out.print("New array without duplicates: ");
        // printing array elements
        for (int i = 0; i < newlength; i++)
            System.out.print(arr[i] + " ");
    }
}