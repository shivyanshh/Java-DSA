package sorting;

public class bubble_sort {
    public int[] sort(int[] arr){
        if(arr.length==0 || arr==null){
            return arr;
        }
        int sorted = arr.length-1;
        while(sorted != 0){
            for(int j=0;j<sorted;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            sorted--;
        }
        return arr;
    }
}
//we swap the adjacent cells checking if they are bigger than the next one , it swaps if its not then
//it iterates ahead. it pushes the max element at last and this is continued until array is sorted.