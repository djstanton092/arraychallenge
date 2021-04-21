package com.dstanton;

import java.util.Scanner;

public class SortedArray {

    private static Scanner scanner = new Scanner(System.in);


    public static void printArray(int[] array) {
        for (int z = 0; z < array.length; z++) {
            System.out.println("Element " + z + " contents " + array[z]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray){
        boolean continueToSort = true;
        int temp;

        int[] sortedArray = new int[unsortedArray.length];

        System.arraycopy(unsortedArray, 0, sortedArray, 0, unsortedArray.length);




        while (continueToSort) {
            continueToSort = false;

            for (int x = 0;  x < sortedArray.length - 1; x++  ){
                if (sortedArray[x] < sortedArray[x + 1]) {
                    temp = sortedArray[x];
                    sortedArray[x] = sortedArray[x + 1];
                    sortedArray[x + 1] = temp;
                    continueToSort = true;
                }
            }
        }
        return sortedArray;
    }


    public static int[] getIntegers(int number) {
        //System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int x = 0; x < values.length; x++ ) {
            values[x] = scanner.nextInt();
        }


        return values;
    }
}
