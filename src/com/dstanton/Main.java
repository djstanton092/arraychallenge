package com.dstanton;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] integers = SortedArray.getIntegers(6);
        int[] sorted = new int[integers.length];

        sorted = SortedArray.sortIntegers(integers);

        SortedArray.printArray(sorted);

        //SortedArray.printArray(SortedArray.printArray(SortedArray.sortIntegers(SortedArray.getIntegers(5))));

    }


}
