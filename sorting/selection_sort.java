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
