public class OrderAgnosticBinarysearch{
    
    //Here we dont know that given array is sorted or not, so for this we need to use Order-Angostic Binary search

    static int orderAgnostic(int arr[],int target){
        int start =0;
        int end=arr.length-1;

        //first check the array if its in increasing order or in descending order.

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid =start+ (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main (String args[]){
        //int a[]={6,9,10,12,56,78,90};           //inceasing ans = 4
        int a[] = {90,87,76,56,45,34,23,10};     //decreasing ans = 3
        int target = 56;
        int result = orderAgnostic(a,target);

        System.out.println(result);
    }
}