# 1

```java
package com.udayan.oca;
 
public class Test {
     public static void main(String[] args) {
         int x = 5;
         while (x < 10) 
             System.out.println(x);
             x++;
     }
}
```

- While or if else without {} will be interpreted as 
```java
while(x < 10){
    System.out.println(x);
}
x++
```

- So this will result into infinite loop