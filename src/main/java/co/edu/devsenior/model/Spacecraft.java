package main.java.co.edu.devsenior.model;

/*
* Create characteristic of spacecraft
* */
public class Spacecraft {

    // Attributes
    protected Double speed;
    protected Integer people;
    protected Integer peopleMax;

    // Constructor
    public Spacecraft(Double speed, Integer people, Integer peopleMax){
        this.speed = speed;
        this.people = people;
        this.peopleMax = peopleMax;
    }

    // Getter
    public Double getSpeed(){
        return speed;
    }
    public Integer getPeople(){
        return people;
    }
    public Integer getPeopleMax(){
        return peopleMax;
    }
}
