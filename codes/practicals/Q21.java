package codes.practicals;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
interface StringProcessor{
    abstract String process(String s);

}

public class Q21 {
    public static void main(String[] args) {
        String str = "hey";
        StringProcessor processor = (s) -> new StringBuffer(s).reverse().toString();
        System.out.println(processor.process(str));
    }
}
