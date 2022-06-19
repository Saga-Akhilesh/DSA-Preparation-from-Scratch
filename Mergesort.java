//recursion
import java.util.*;
public class Mergesort{
    static int[] Mergesorting(int arr[]){     //it needs to return array
        //base condition
        if(arr.length==1){  //returns array if array length is equal to 1 which  is base condition
            return arr;
        }
        int mid=arr.length/2;   //take middle element and split the array into two parts
        int[]left= Mergesorting(Arrays.copyOfRange(arr,0,mid));
        int[]right= Mergesorting(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(arr,left,right);
    }
    static int[] merge(int arr[],int first[],int second[]){
        int mix[]=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
        if(first[i]<second[j]){
            mix[k]=first[i];
            i++;
        }else{
            mix[k]=second[j];
            j++;
        }
        k++;
    }
        //If one of the array is not complete then all the remaning elements in respective arrays should be added into resultant array
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    public static void main(String args[]){
        int arr[]={90,10,50,70,80,40};
        arr=Mergesorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}