import java.util.*;

public class bubblesort{
    static void bubblesorting(int arr[]){
        boolean swapped;
        for (int i=0;i<arr.length;i++){
            swapped =false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String args[]){
        int arr[]= {-1,0,56,78,90};
        bubblesorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}