# Q1 

```java
    try {
        throw new SQLException();
    } catch (Exception e) {
        throw null; //Line 10
    }
```
- We can't throw null pointer 
- It will give ```NullPointerException```

# Q2

```java
 public static void main(String[] args) {
        int var = 3;
        String [][] arr = new String[--var][var++]; //Line n1
        arr[1][1] = "X"; //Line n2
        arr[1][2] = "Y"; //Line n3
        for(String [] arr1 : arr) {
            for(String s : arr1) {
                if(s != null) 
                    System.out.print(s);
            }
        }
    }
```

- It will throw ```RunTimeException``` because index exceptions are unchecked

