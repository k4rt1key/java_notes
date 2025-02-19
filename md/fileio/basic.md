# fileio

### auto-close fileio class

```
BufferedReader
BufferedWriter
FileReader
FileWriter
InputStream
OutputStream
Scanner
```
- These class are auto-close if we initialize them with ```try-resource-block```

```java
import java.io.FileWriter;
try(FileWriter writer = new FileWriter("a.txt")){ // auto-close

}catch(Exception e){
    
}
```

- Without ```try-resource-block``` we have to manually close
```java
import java.io.FileWriter;
try{ // auto-close
    FileWriter writer = new FileWriter("a.txt");
    writer.close();
}catch(Exception e){
    
}
```