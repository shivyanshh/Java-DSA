package searching;

public class linear_search {
    public int linear(int[] arr, int k){
        int flag=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("linear search progress\n");
            if(arr[i]==k){
                flag++;
                return i;
            }
        }
        return -1;
    }
}
