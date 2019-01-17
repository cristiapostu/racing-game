package org.fasttrackit;

import java.sql.SQLOutput;

public class Vehicle {

    public static int vehicleCount;

    private String name;
    private String color;
    private double mileage;
    private double fuellevel;
    private double totalTraveledDistance;


    public Vehicle() {
        vehicleCount++;
    }

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " accelerated with " + speed + " km/h for " + durationInHours + " hours ");

        double traveledDistance = speed * durationInHours;

        System.out.println("Traveled distance: " + traveledDistance + " km ");

//      same as: totalTraveledDistance = totalTraveledDistance + traveledDistance;
        totalTraveledDistance += traveledDistance;
        System.out.println("Total traveled distance: " + traveledDistance + "km.");

        double spentFuel = traveledDistance + mileage / 100;
        fuellevel -= spentFuel;
        System.out.println("Remaining fuel: " + fuellevel);

        return traveledDistance;
    }
//    example of method overloading
    public double accelerate(double speed) {
        return accelerate(speed, 1);
    }

    protected Vehicle clone(){
        Vehicle vehicle = new Vehicle();
//        copyproperties from current object or simply call this.clone();
        return vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuellevel() {
        return fuellevel;
    }

    public void setFuellevel(double fuellevel) {
        this.fuellevel = fuellevel;
    }

    public double getTotalTraveledDistance() {
        return totalTraveledDistance;
    }

    public void setTotalTraveledDistance(double totalTraveledDistance) {
        this.totalTraveledDistance = totalTraveledDistance;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
