import java.util.Arrays;
public class cyclicsort{
    static void cyclicsorting(int arr[]){
        int i=0;
        while(i<arr.length){
            int correctindex=arr[i]-1;
            if(arr[i]!=arr[correctindex]){
                swap(arr,i,correctindex);
            }else{
                i++;
            }
        }
    }
    static void swap(int arr[],int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    public static void main(String args[]){
        int arr[]={3,5,2,1,4};
        cyclicsorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}