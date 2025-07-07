
import java.util.Scanner;

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
    public String message(){
        return message;
    }

    @Override // Overwriting the method where it is implemented shows a message
    public String toString(){
        return String.format("""
                -ΩΦδ-ΩΦδ-ΩΦδ-  Planeta  -ΩΦδ-ΩΦδ-ΩΦδ-
                Nombre = %s
                Distancia = %.2f
                '%s'
                """,name, distance, message);
    }
}