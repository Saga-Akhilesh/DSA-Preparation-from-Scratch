class linearsearching {
    static int linearsearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }

        //run a loop
        for(int i=0;i<=arr.length-1;i++){
            int element = arr[i];
            if(element==target){
                return i;           //if found return index
            }
        }
         return -1;          // if not found then return -1
    }
        public static void main (String args[]){
            int a[]={90,70,65,49,9,8};
            int target = 9;
            int result = linearsearch(a,target);
    
            System.out.println(result);
        }
    
    }
