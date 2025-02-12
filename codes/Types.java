package codes;

public class Types {

    static void types() {

        // === Primitive data types ===
        boolean bo = true;
        byte b = 127;
        short s = 32767;
        int a = 1;
        long l = 10101010L; // Or 10101010l
        float f = 1.00F; // Or 1.00f
        double d = 1.00; // Or 1.00D or 1.00d & by default x.y number is in double format
        char c = 65; // Default encoding is utf-16 ( Range : 0 - 2^16 )

        // === Non-premitive data types ===
        // 1) Class
        // Wrapper class
            // - Wraps / Encapsulates primitive data type into objects
            // - Useful in ArrayList ( Which only accpets object )
            // - How we can directly assing value to the wrapper class without constructor
            // ??
            // - Using autoboxing
                // - Process of converting primitve datatype to it's wrapper datatype is called
                // boxing
                // Example : Integer i = new Integer(10) // this is boxing
                // Compiler automatically does this process to convert premitive to Wrapper
                // that's why it's called auto boxing
                // For autoboxing (primitive → wrapper): Integer.valueOf(i) used
            // - Process of converting wrapper datatype to it's primitive datatype is called
            // unboxing
                // Example : Integer i = new Integer(10); int j = i; // this is unboxing
                // For unboxing (wrapper → primitive): i.intValue() is used

        // 2) Interface
        // 3) Arrays

        /*
         * Arrays are object of Object class and implements Clonable and java.io.Serializable
         * - Elements of array are initialized with default value for primitive and for class it is null
         * - Once initialized array's length can't be changed
         * - If i do int[] arr1 = {1,2,3}; and int[] arr2 = arr1
         *      - It will not deepcopy but shalow copy ( Assigns reference or arr1 to the arr2 ) 
         * 
         * - For int[] arr = new int[]{1,2,3};
         *      - At compile time compiler stores info about variable arr and it having size of 4
         *      - During runtime it will assings value 1,2,3 in heap and references that memory 
         */

        // 0 ===
        // int[] arr0 = new int[-1];
        // This will throw exception

        // 1 === declaration
        int[] arr = new int[0];
        // OUTPUT : [I@1442d7b5
        //      - [ Array
        //      - I integer
        //      - 1442d7b5 Hashcode
        System.out.println(arr);


        // 2 === declaration with initialization
        int[] arr2 = {1,2,3,4,5};
        System.out.println(arr2);

        // 3 === 
        int[] arr3 = new int[]{1,2,3,4,5};
        System.out.println(arr3);

        // 4 ===
        int arr4[] = new int[3];
        System.out.println(arr4);

        // 5 ===
        int arr5[][] = new int[3][4];
        System.out.println(arr5);

        // 6 ===
        int arr6[][] = new int[][]{{1,2},{3,4}};
        System.out.println(arr6);

        // 7 ===
        int arr7[][] = new int[3][];
        arr7[0] = new int[1];
        arr7[1] = new int[2];
        arr7[2] = new int[3];
        System.out.println(arr7);

        // 4) Enums

        /*
         * Enum inherited java.lang.Enum<T>
         * 
         * Java assigns integer value to each Enum constants ( starting from 0 )
         * Each enum has "name" which can be retrived using .name() method
         * Each enum has "ordinal" which can be retrived using .ordinal() method ( which
         * will give us index of enum )
         * Enum's constructor is private
         * 
         */

        enum Color {
            RED, BLUE, GREEN, YELLOW;
        }

        Color bloodColor = Color.RED;

        // 5) Strings

        // Naming
        int $1 = 10;
        int _abc = 20;

        /*
         * Can't start with numbers
         * Only 2 special chars ( $ and _ ) are allowed
         * 
         */
    }

    public static void main(String[] args) {
        types();
    }
}
