package com.company;
import java.util.Arrays;

public class inPlaceSorts
{

    public static void bubbleSort(String[] list1)
    {
        for (int i = 0; i < list1.length; i++)
        {
            for (int j = 0; j < list1.length - i - 1; j++) {
                if (list1[j].compareTo(list1[j+1]) > 0) {
                    swapString(list1, j, j + 1);
                }
            }
        }
    }
    public static void swapString(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


        public static void SelectionSort(int[] list1)
        {
            //Loops through unsorted array
            for(int i = 0; i < list1.length - 1; i++)
            {
                int min = i;
                //Compares arr[i] with all other indexes
                for(int j = i + 1; j<list1.length; j++)
                {
                    //Sets min to the index with a number smaller the index it was currently at
                    if (list1[j] < list1[min])
                    {
                        min = j;
                    }
                }
                //Swaps the two indexes, unless it is at the same position
                if(min != i)
                {
                    swap(list1, i, min);
                }

            }
        }
        public static void swap(int[] list1, int i, int min)
        {
            int temp = i;
            list1[i] = min;
            min = temp;
        }


            public static void InsertionSort(int[] list1) {

                System.out.println(Arrays.toString(list1));
                insertion(list1);
                System.out.println(Arrays.toString(list1));
            }

            public static void insertion (int list1[])
            {
                for (int i=1;i<list1.length;i++)
                {
                    int key = list1[i];
                    int x = i-1;

                    while (x>=0 && list1[x]>key) // moves all of the numbers before the key right to make space.
                    {
                        list1[x+1] = list1[x];
                        x=x-1;
                    }
                    list1[x+1] = key;
                }
            }

           public static String[] randomStringArr(int num, int length)
           {
                  String [] arr = new String [num];
                  while (num > 0)
                  {
            int i = 0;
            String s = "";
            while (i < length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num --;
            arr[num] = s;
        }
        return arr;
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

    public static double[] randDoubleArr(int count)
    {
        double[] arr = new double[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Math.random()*10000.0;
        }
        return arr;
    }
    }


