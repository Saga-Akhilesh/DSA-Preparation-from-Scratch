public class binarysearching{
    static int binarysearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;

        //find middle element
        //if target <mid then search in left
        //if target>mid then search in right
        //now if middle==target then return mid element

        while(start<=end){
            int mid = start+ (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1; //if not found
    }
    public static void main (String args[]){
        int a[]={6,9,10,12,56,78,90};           //sorted array
        int target = 56;
        int result = binarysearch(a,target);

        System.out.println(result);
    }
}