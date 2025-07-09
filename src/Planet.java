
/*
* Crate the destinations of the trip, interaction of each planet
* */

public class Planet {

    // Attributes
    private String name;
    private double distance; // Distance from Earth
    private String message; // Message of planet

    // Builder to initialize attributes
    public Planet(String name, double distance, String message){
        this.name = name;
        this.distance = distance;
        this.message = message;
    }

    // Getters to access attributes
    public String getName(){
        return name;
    }
    public double getDistance(){
        return distance;
    }
    public String getMessage(){
        return message;
    }
}