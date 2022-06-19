import java.util.*;
public class quicksort{
    static void quicksorting(int arr[],int low ,int high){
        //Here we will use 4 pointers  => low, high are main, they tell us which part of array you are working on
        //                             => start,end are for swapping inside the array
        // Now e will present before s. after completing (s<=e)
        // here two halves will be low to end(1st half-->left side of pivot) and start to high. (2nd half-->right side of pivot)
        // These two halves will be sorted in themselves after partition.
        if(low>=high){
            return;
        }
        int s =low;
        int e = high;
        int mid = s+(e-s)/2;
        int pivot = arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            } //for voilations like having greater element at left side of pivot and smaller element at right side of pivot
            if(s<=e){  //if its already sorted then it will not swap
                int temp =arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        //Now pivot is at correct index, so swap two halves.
        quicksorting(arr,low,e);
        quicksorting(arr,s,high);
    }
    public static void main(String args[]){
        int arr[]={60,50,30,40,100,90};
        quicksorting(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}