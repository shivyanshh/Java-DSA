package sorting;

public class insetion_sort {
    public int[] sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int index=i;
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp= arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
//outer loop iterates from 1 to length-1
//inner loop iterates opposite and checks if j<j-1, if yes it swaps 
//until the that range of array is sorted. 
//then it comes out of inner and outer loop iterates again.