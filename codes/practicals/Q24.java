package codes.practicals;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class A{
    A(){}
    int a = 10;
    int b = 10;
    void func(){}
    void add(int a, int b){}
    private void print(String s){}
}
public class Q24 {
    public static void main(String[] args) throws Exception {
        Class<?> reflection = A.class;
        // Method[] methods = reflection.getMethods(); // only public methods are retrieved
        Method[] methods = reflection.getDeclaredMethods(); // all declared methods are retrieved
        System.out.println(reflection.getConstructor().getName());
        for(Method method : methods){
            int modifiers = method.getModifiers();
            String modifierString = Modifier.toString(modifiers);
            String returnType = method.getReturnType().getSimpleName();
            String methodName = method.getName();

            Class<?>[] paramTypes = method.getParameterTypes();
            StringBuilder parameters = new StringBuilder();
            for (Class<?> param : paramTypes) {
                parameters.append(param.getSimpleName()).append(", ");
            }
            System.out.println(modifierString + " " + returnType + " " + methodName + "(" + parameters + ")");
        }
    }

}
