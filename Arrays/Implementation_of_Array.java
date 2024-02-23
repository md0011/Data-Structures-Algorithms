/*
Sample input
5
10 20 30 40 50

Sample output:
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
*/

import java.util.Scanner;

class Implementation_of_Array {
    public static void main(String[] args) {

        System.out.print("Enter a size of an array: ");
        Scanner in = new Scanner(System.in);
        int n, i;
        n = in.nextInt(); // enter no. of elements
        int[] array = new int[n]; // allocating memory to array

        System.out.println("Enter an array elements: ");
        // scan elements of array
        for (i = 0; i < n; i++)
            array[i] = in.nextInt();

        for (i = 0; i < n; i++) {
            System.out.println("Element at index " + i + " : " + array[i]);
        }
    }
}