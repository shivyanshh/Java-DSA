package searching;

public class binary_search {
    public int binary(int[] arr, int k){
        int mid = arr.length/2;
            if(arr.length%2!=0){
                mid = (arr.length+1)/2;
            }
            if(mid>k){
                for(int i=0;i<mid;i++){
                    System.out.println("binary search progress\n");
                    if(arr[i]==k){
                        return i;
                    }
                }    
            }
            else{
                for(int i=mid;i<arr.length;i++){
                    System.out.println("binary search progress\n");
                    if(arr[i]==k){
                        return i;
                    }
                }
            }

        return -1;
    }
}
