# Edge cases 

## 1

```java
List<Integer> l = Arrays.asList(null); // it will give null pointer exception
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l.get(0));

``` 

- `NullPointerException`

