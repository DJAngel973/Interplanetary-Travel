package main.java.co.edu.devsenior.model;

public class Orus extends Spacecraft {

    // Constructor
    public Orus(){
        this.speed = 270.00;
        this.people = 25;
    }

    // Getters
    public Double getSpeed(){
        return this.speed;
    }
    public Integer getPeople(){
        return this.people;
    }
}