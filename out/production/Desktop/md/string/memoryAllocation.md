## Memory allocation in each case

- When we write 
```java 
String s = "kartikey" 
```
- it will first check in the string pool 
- string exist 
    - s references to that string present in string pool
- not exist 
    - string is created in the pool and s references into that string


- When we write 
```java 
String s = new String("kartikey"); // 1 object in heap one in string pool
String t = new String("kartikey"); // 1 object in heap and references to already exist object in string pool
String u = new String("vaghasiya"); // 1 object in heap one in string pool

// Same for new StringBuilder() and new StringBuffer()
```

## Memory allocation with final keyword

```java
final String name = "kartikey"; // one object in string pool
final String surname = "vaghasiya"; // one object in string pool
String fullName = new String(name + surname); // two in heap, one for new String() one for name + surname
// this will not store kartikeyvaghasiya ( name + surname ) into string pool 
// because string created using concat, substring will not goes into string pool
// it will be stored on heap until we run .intern() method;
String fullName2 = name + surname // one in heap, for name + surname
// this also will not store kartikeyvaghasiya  ( name + surname ) into string pool
// because string created using concat, substring will not goes into string pool
// it will be stored on heap until we run .intern() method; 
System.out.println(fullName);

final String s1 = "hey";
final String s2 = "kartikey";
final String s3 = "heykartikey";


if(s3 == s1 + s2){
    System.out.println("same");
} else {
    System.out.println("diff");
}

// it will print same due to compiletime optimization due to final keyword
```

## Comparision

```java
// 1 > == ( reference comparision )
String name = "kartikey";
String friendName = "kartikey";

if(name == friendName){
    System.out.println("same");
} else {
    System.out.println("diff");
}
// $> same


String surname = new String("vaghasiya");
String friendSurname = new String("vaghasiya");

if(name == friendName){
    System.out.println("same");
} else {
    System.out.println("diff");
}
// $> diff
// Because surname and friendSurname uses new String() to create new string
// so it is diff objects in the heap


// === String concat case  ===

// Case 1: Compile-time concatenation
String c1 = "hello" + "world";
String c2 = "helloworld";
System.out.println(c1 == c2);  // true (compile-time optimization)

// Case 2: Runtime concatenation with variables
String a = "hello";
String b = "world";

String d1 = a + b;
String d2 = "helloworld";
System.out.println(d1 == d2);  // false (d1 is created at runtime)

// Case 3: with final variables (can be optimized by compiler)
final String e = "hello";
final String f = "world";
String g = e + f;
System.out.println(g == c2);  // true (in most JVMs with optimization)

// 2 > .equals() ( value comparision )
String companyName = "apple";
String brandName = new String("apple");

System.out.println(companyName.equals(brandName)) // true
```


