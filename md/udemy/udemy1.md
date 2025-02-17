# NOTES

## Q1

```java
//Order.java
package orders;
 
public class Order {
    
}


//Item.java
package orders.items;
 
public class Item {
    
}


//Shop.java
package shopping;
 
/*INSERT*/

// OPTION 1
import orders.*;
import orders.items.*;

// OPTION 2 
import orders.Order;
import orders.items.Item;
 
public class Shop {
     Order order = null;
     Item item = null;
}
```

## Q2

public class java.lang.Error extends **Throwable**

## Q3

We can't insert null or objects in string builder

## Q4 

```java
package com.udayan.oca;
 
public class Test {
     public static void main(String[] args) {
         m1(); //Line 3
     }
 
     private static void m1() throws Exception { //Line 6
         System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
     }
}

```

If a method declares to throw Exception or its sub-type other than RuntimeException types, then calling method should follow handle or declare rule. In this case, as method m1() declares to throw Exception, so main method should either declare the same exception or its super type in its throws clause OR m1(); should be surrounded by try-catch block.

## Q5

```java
public class Test {
     public static void main(String[] args) {
         double price = 90000;
         String model;
         if(price > 100000) {
             model = "Tesla Model X";
         } else if(price <= 100000) {
             model = "Tesla Model S";
         }
           System.out.println(model);
     }
}
```

- Due to uncertinity in assignment of model string 
- sout(model) will give error

## Q6

```java 
double [] arr = new int[2]; 
```
We can't do this

## Q7 
