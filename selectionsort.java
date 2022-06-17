import java.util.Arrays;
public class selectionsort{
    static void selectionsorting(int arr[]){
        //select max item and last item and swap both of them.
        for(int i=0;i<arr.length;i++){
        int lastindex = arr.length-i-1; 
        int maxindex = getmaxindex(arr,0,lastindex);
        swap(arr,maxindex, lastindex);
        }
    }

    static int getmaxindex(int arr[],int start,int end){
        // Here we are finding the index which has max element so we assume maximum at index start 
        //then iterate over the loop from start till end which upto unsorted part (i.e, (arr.length-i-1)) 
        //then if max element which we have is less than the element in array at particular index, then i is the new maximum.
        // then swap that element with max element. 
        int max= start;
        for (int i=start;i<=end;i++){              
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int arr[],int first,int last){    //swap function
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    public static void main(String args[]){
        int arr[]={2, 32, 0, -7, 1};
        selectionsorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}