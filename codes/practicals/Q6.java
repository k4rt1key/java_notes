package codes.practicals;

/*
 * Generics : 
 *      - Generics enable to create classes and methods that work with any data type
 */

public class Q6 {
    public static void main(String[] args) {
        Box<Integer> box = new Box();
        box.setValue(1);
        System.out.println(box.getValue());

        Box<String> sBox = new Box();
        sBox.setValue("HEY");
        System.out.println(sBox.getValue());
    }
}

class Box<T>{
    T value;
    Box(){}
    Box(T val){
        this.value = val;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
