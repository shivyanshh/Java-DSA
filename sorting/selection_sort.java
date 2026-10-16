package sorting;
public class selection_sort{
    public int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minvalue = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minvalue]> arr[j]){
                    minvalue = j;
                }
            }
            if(minvalue != i){
                int temp = arr[i];
                arr[i]= arr[minvalue];
                arr[minvalue]=temp;
            }
        }
        return arr;
    }
}
//it has two loops, outer loop iterates till the length of array times
//inner loop remembers if the minimum value is greater than next , if it is
//it updates the value
//and once the inner loop ends, it swaps the minimum value to the new value at the iterating position