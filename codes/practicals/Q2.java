package codes.practicals;

public class Q2 {
    public static void main(String[] args) {
        
        Vehicle v = new Vehicle("12", "X2", "2025");
        Motorcycle m = new Motorcycle("12", "X2", "2025",true);
        Car c = new Car("12", "X2", "2025",4);
        
        m.displayDetails();
    }
}


class Vehicle {

    Vehicle(){}
    Vehicle(String make, String model, String year){
        this.make = make;
        this.model = model;
        this.year = year;
    }   

    String make;
    String model;
    String year;

    void displayDetails(){
        String m = "Make is = " + make;
        String mm = "Model is = " + model;
        String y = "Year is = " + year;

        System.out.println(m);
        System.out.println(mm);
        System.out.println(y);
    }
}

class Car extends Vehicle {
    int numOfDoors;

    Car(){}
    Car(String make, String model, String year, int numOfDoors){
        super(make,model,year);
        this.numOfDoors = numOfDoors;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Num of doors = " + numOfDoors);
    }
}

class Motorcycle extends Vehicle {
    boolean hasSideCar;

    Motorcycle(){}
    Motorcycle(String make, String model, String year, boolean hasSideCar){
        super(make,model,year);
        this.hasSideCar = hasSideCar;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Num of hasSideCar = " + hasSideCar);
    }
}

