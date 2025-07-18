package main.java.co.edu.devsenior.model;

public class SpacecraftService {

    // Method for entering passengers on the trip
    public String assignPassengers(Spacecraft spacecraft, int numberPeople){

        if (numberPeople <= 0) {
            return "El número de personas debe ser mayor a cero.";
        }else if (numberPeople > spacecraft.getPeopleMax()){
            return "El número de personas (" + numberPeople + ") es mayor a la capacidad de la nave (" + spacecraft.getPeopleMax() +").";
        }

        // Save entered amount
        spacecraft.setPeople(numberPeople);
        return null;
    }
}
