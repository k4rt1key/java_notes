package codes.practicals;


public class Q25 {

    static void v(int... args){
        System.out.println(args.length);
        for(int i : args){
            System.out.print(i + "-");
        }
    }
    public static void main(String[] args){
        v(new int[]{1,2,3,4});
    }
}
