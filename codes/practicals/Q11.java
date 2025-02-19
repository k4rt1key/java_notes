package codes.practicals;

class Swap<T>{
    void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
public class Q11{
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c", "d"};
        Swap s = new Swap();
        s.swap(arr,0,2);
        System.out.println(arr[0] + "-" + arr[1] + "-" + arr[2] + "-" + arr[3]);

    }
}
