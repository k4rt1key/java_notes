package codes.practicals;

interface Shape {
    float calculateArea();
}

class Circle implements Shape {
    Circle(){}
    private float r;
    Circle(float r){
        this.r = r;
    }
    public float calculateArea(){
        float f = 2 * 3.14f * r;
        return f;
    }

}

class Rectangle implements Shape {
    Rectangle(){}
    Rectangle(float l, float b){
        this.l = l;
        this.b = b;
    }
    private float l,b;
    public float calculateArea(){
        float f = l * b;
        return f;
    }
}

class Triangle implements Shape {
    Triangle(){}
    private float h,b;

    Triangle(float h, float b){
        this.h = h;
        this.b = b;
    }
    @Override
    public float calculateArea() {
        return 0.5f * h * b;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Triangle t = new Triangle(1,2);
        System.out.println(t.calculateArea());
    }
}
