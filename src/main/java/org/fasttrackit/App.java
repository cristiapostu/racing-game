package org.fasttrackit;

import org.fasttrackit.cheater.UFO;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Game game = new Game();
        game.start();


//
//        Engine engine = new Engine();
//        engine.manufacturer = "Renault";
//        engine.capacity = 1500;
//
//
//        Car car = new Car (engine);
//        car.setName("Dacia");
//        car.setColor("white");
//        car.doorCount = 4;
//        car.setMileage(7.5);
//        car.running = true;
//
//        System.out.println(car.getName());
//
//        double carTraveldDistance = car.accelerate(100, 2);
//
//
//
//        car.engine = engine;
//
//        engine = null;
//
//        Car car2 = new Car(engine);
//        car2.setName("sfa");
//
////        Example of static variables unique for thr whole application
//
//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.vehicleCount = 1;
//
//        Vehicle vehicle2 = new Vehicle();
//        vehicle2.vehicleCount = 2;
//
//        Vehicle.vehicleCount = 3;
//
//        System.out.println("Value from vehicle 1:" + vehicle1.vehicleCount);
//        System.out.println("Value from vehicle 2:" + vehicle1.vehicleCount);
//        System.out.println("Value from vehicle class:" + vehicle1.vehicleCount);
//
//
//        new AutoVehicle();
//
//        new AutoVehicle(new Engine());
////example of invoking overloaded methods
//        vehicle1.accelerate(34.12);
//        vehicle2.accelerate(130, 0.8);
//
//        new UFO().accelerate (130, 0.8);
////polymorphism (an object can take multiple forms)
//        Vehicle ufo = new UFO();
////        The type of the variable does NOT determine the objec's behaviour
//        ufo.accelerate(200,2);
////  the type of the variable determines what method can be invoked
////   we might need type casting (see below)
//        ((UFO) ufo).concealCheating();
//

    }
}
