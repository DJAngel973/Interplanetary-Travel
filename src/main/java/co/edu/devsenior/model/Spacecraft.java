package main.java.co.edu.devsenior.model;

/*
* Create characteristic of spacecraft
* */
public abstract class Spacecraft {

    // Attributes
    protected Double speed;
    protected Integer people;
    protected Integer peopleMax;
    protected String name;

    // Constructor
    public Spacecraft(String name, Double speed, Integer people, Integer peopleMax){
        this.name = name;
        this.speed = speed;
        this.people = people;
        this.peopleMax = peopleMax;
    }

    // Getter
    public String getName(){
        return name;
    }
    public Double getSpeed(){
        return speed;
    }
    public Integer getPeople(){
        return people;
    }
    public Integer getPeopleMax(){
        return peopleMax;
    }

    // Setter
    public void setPeople(Integer people){
        this.people = people;
    }
}