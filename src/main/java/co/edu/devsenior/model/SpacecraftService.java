package main.java.co.edu.devsenior.model;

import main.java.co.edu.devsenior.view.ConsoleUI;

public class SpacecraftService {

    private final ConsoleUI consoleUI = new ConsoleUI();

    // Method for entering passengers on the trip
    public String assignPassengers(Spacecraft spacecraft, int numberPeople){

        while (numberPeople <= 0 || numberPeople > spacecraft.getPeopleMax()) {

            // Show error
            if (numberPeople <= 0) {
                System.out.println("Error: el número debe ser mayor que cero.");
            } else {
                System.out.println("Error: el número excede la cantidad de la nave (" + spacecraft.getPeopleMax() + ").");
            }
            // We request the number again
            numberPeople = consoleUI.errorPeople();
        }
        // Save number of people
        spacecraft.setPeople(numberPeople);
        return String.format("Pasajeros ingresados (%d) a la nave %s ", spacecraft.getPeople(), spacecraft.getName());
    }
    // Method calculate time of trip
    public String timeTrip(Spacecraft spacecraft, Planet planet){

        // data speed formula
        double distanceMill = planet.getDistance() * 1_000_000;
        double time = distanceMill / spacecraft.getSpeed();
        time /= 24;

        // Message
        return String.format("El viaje para %s durara %.0f dias", planet.getName(), time);
    }
}
