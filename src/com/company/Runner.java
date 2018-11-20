package com.company;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int[] arr = inPlaceSorts.randIntArr(50000);
        System.out.println(Arrays.toString(arr) + "\n Processing...");
        inPlaceSorts.insertionSort(arr);
        System.out.println(Arrays.toString(arr) + "\n Done");
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
        System.out.println("---------------");
        double[] arrDouble = inPlaceSorts.randDoubleArr(50000);
        time = System.currentTimeMillis();
        System.out.println(Arrays.toString(arrDouble) + "\n Processing...");
        inPlaceSorts.SelectionSort(arrDouble);
        System.out.println(Arrays.toString(arrDouble) + "\n Done");
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
        System.out.println("---------------");
        String[] arrString = inPlaceSorts.randomStringArr(50000, 4);
        time = System.currentTimeMillis();
        System.out.println(Arrays.toString(arrString) + "\n Processing...");
        inPlaceSorts.bubbleSort(arrString);
        System.out.println(Arrays.toString(arrString) + "\n Done");
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
    }
}