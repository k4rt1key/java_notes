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

- `NullPointerException` because list is **unmutable** and we assigned ```l = null``` during ```Array.asList(null)```
- It will assign ```l = null``` 

