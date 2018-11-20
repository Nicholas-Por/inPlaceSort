package com.company;
import java.util.Arrays;

public class inPlaceSorts
{
    public  String[] randomStringArr(int num, int length)
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
    public class Bubblesort {

        public  void Bubblesort(String[] list1) {
            int[] arr = new int[10];
            arr[0] = 9;
            arr[1] = 8;
            arr[2] = 7;
            arr[3] = 6;
            arr[4] = 0;
            arr[5] = 4;
            arr[6] = 3;
            arr[7] = 2;
            arr[8] = 1;
            arr[9] = 5;

            System.out.println(Arrays.toString(arr));


            bubbleSort(arr);
            System.out.println(Arrays.toString(arr));
        }


        public  void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        public  void bubbleSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        swap(arr,i,j);

                    }
                }

            }

        }
        public int[] randomIntarr(int count)
        {
            int[] cut =new int[count];
            for (int i=0;i<cut.length;i++)
            {
                cut[i]=(int)(Math.random()*10000);
            }
            return cut;

        }
    }
    public class SelectionSort {

        public  void SelectionSort(int[] arr)
        {
            //Loops through unsorted array
            for(int i = 0; i < arr.length - 1; i++)
            {
                int min = i;
                //Compares arr[i] with all other indexes
                for(int j = i + 1; j<arr.length; j++)
                {
                    //Sets min to the index with a number smaller the index it was currently at
                    if (arr[j] < arr[min])
                    {
                        min = j;
                    }
                }
                //Swaps the two indexes, unless it is at the same position
                if(min != i)
                {
                    swap(arr, i, min);
                }

            }
        }
        public void swap(int[] arr, int i, int min)
        {
            int temp = i;
            arr[i] = min;
            min = temp;
        }
        public class InsertionSort {

            public  void InsertionSort(String[] args) {
                int[] arr = new int[10];
                arr[0] = 9;
                arr[1] = 8;
                arr[2] = 7;
                arr[3] = 6;
                arr[4] = 0;
                arr[5] = 4;
                arr[6] = 3;
                arr[7] = 2;
                arr[8] = 1;
                arr[9] = 5;

                System.out.println(Arrays.toString(arr));
                insertion(arr);
                System.out.println(Arrays.toString(arr));
            }

            public  void insertion (int arr[])
            {
                for (int i=1;i<arr.length;i++)
                {
                    int key = arr[i];
                    int x = i-1;

                    while (x>=0 && arr[x]>key) // moves all of the numbers before the key right to make space.
                    {
                        arr[x+1] = arr[x];
                        x=x-1;
                    }
                    arr[x+1] = key;
                }
            }
        }
    }

}
