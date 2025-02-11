package Codes;

public class Loops {
    public static void main(String[] args) {
        /*
         * ### For Loop ###
         * === 1 === 
         * int i = 0;
         * for( ; i < 10; i++ ){}
         * 
         * === 2 ===
         * for(int i = 0; i < 10; ){ i++;}
         * 
         * === 3 ===
         * 
         * 1) for(;;){}
         * 2) for(int i = 0;;){}
         * 
         * Both will give compile time error 
         * E) eroor: unreachable statement 
         * If we just write break; statement inside loop or provide condition inside for()...
         * Error will not occur
         */
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }


        /*
         * ### While loop ###
         * 
         * === 1 === If we use while(true){} and does not provide any break statement inside 
         * It will give compile error ( Same for do while )
         * E) Loops.java:31: error: unreachable statement
         * E) System.out.println("YO");
         
            ```
                while (true) {   

                }
                
                System.out.println("YO");
            ```
        
        */
        
        /*
         * ### Do While loop ###
         * 
            int k = 0;
            do{
                
            } while(true);
        */
    }
}
