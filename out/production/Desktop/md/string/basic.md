# String 

- object of **java.lang.String**


```java
// > 1
String name = new String();
// > 2
String addr = new String("");
// > 3
char[] surnameCharArr = new char[0];
String surname = new String(surnameCharArr);


if(name == addr){ System.out.println("same name-addr"); }
else if(name == surname){ System.out.println("same name-surname"); }
else if(surname == addr){ System.out.println("same surname-addr"); }
else { System.out.println("all diff"); }

//$> all diff
```

## String operations 

```java
// > 1 concat
String name = "kartikey";
String surname = "vaghasiya";

String fullname = name.concat(surname);
// or String fullname = name + surname;

System.out.println(fullname);

// > 2 format
String intro = String.format("My name is %s and my age is %f", fullname, 21f);
System.out.println(intro);

```



