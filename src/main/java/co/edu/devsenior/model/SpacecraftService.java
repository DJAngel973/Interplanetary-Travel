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
}
