package sorting;

public class test {
    public static void main(String[] args) {
        selection_sort obj1 = new selection_sort();
        int[] array={13,46,24,52,20,9};
        //int[] newarray = obj1.sort(array);
        bubble_sort bubble = new bubble_sort();
        //int[] newarray = bubble.sort(array);
        insetion_sort insertion = new insetion_sort();
        int[] newarray = insertion.sort(array);
        for(int i=0;i<newarray.length;i++){
            System.out.println(newarray[i]);
        }
    }
}
