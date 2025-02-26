# java.util.List

- list is interface
- used to store ordered collection of elements
- maintains order of elements in which they are added
- allows duplicates
- implementation of List interface is **ArrayList**, **Stack**, **Vector**, **LinkedList**


```java
        List<Integer> l = new ArrayList<>();

        // add 
        l.add(1);
        l.add(2);
        l.add(3);
        
        // add at specific index 
        l.add(0, 10); 


        // get specific index value
        System.out.println(l.get(0)); 

        // set element present at 1st index to value 3
        l.set(1,3);
        System.out.println(l); 

        // remove element present at 2nd index
        l.remove(2); 
        System.out.println(l); 

        // remove particular element 
        // ( it will remove first occurance of that object )
        Integer i = 3;
        l.remove(i); 
        System.out.println(l); 
        
        // search
        // first occurance index, -1 if not found
        l.indexOf(1);
        
        // last occurance index, -1 if not found
        l.lastIndexOf(2);
        
        // check if object is present or not
        l.contains(2);

```

- **Types of List**

  - 1. Mutable
       1. Lists created using new ArrayList<>() or new LinkedList<>() are mutable
       2. ```java
          List<Integer> list = new ArrayList<>();
          list.add(1);
          list.add(2);
          list.remove(0);
          System.out.println(list); // [2]
        
          ```
          
  - 2. Unmutable
       1. Lists created using Arrays.asList() or List.of() are immutable
       2. ```java
            List<Integer> list = Arrays.asList(1, 2, 3);
            list.add(4);  // Throws UnsupportedOperationException
            list.remove(0); // Throws UnsupportedOperationException
          ```
  
### NOTE :
```java
Arrays.asList(1,2,3,4); // is returning new ArrayList<>();
```