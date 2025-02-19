package codes.practicals;

abstract class VehicleClass {
    abstract void start();
    abstract void stop();
}

class BikeClass extends VehicleClass{
    void start(){
        System.out.println("Bike started");
    }

    void stop(){
        System.out.println("Bike stopped");
    }
}

class CarClass extends VehicleClass{
    void start(){
        System.out.println("Car started");
    }

    void stop(){
        System.out.println("Car Stopped");
    }
}

public class Q9 {
    public static void main(String[] args) {
        VehicleClass car = new CarClass();
        car.start();
        car.stop();

        VehicleClass bike = new BikeClass();
        bike.start();
        bike.stop();
    }
}
