package searching;

public class test {
    public static void main(String[] args) {
        int[] arr={6,7,4,3,2,1,0,39,10};
        linear_search obj = new linear_search();
        int index = obj.linear(arr, 89);
        System.out.println(index);

        int[] arr2 = {2,4,6,8,9,10,12,18,19,20};
        binary_search obj2 = new binary_search();
        int indexx = obj2.binary(arr2, 20);
        System.out.println(indexx);
    }
}