package main.java.co.edu.devsenior.controller;

import main.java.co.edu.devsenior.model.*;
import main.java.co.edu.devsenior.view.ConsoleUI;

public class PlanetController {

    // Attributes
    private final PlanetSystem planetSystem;
    private final ConsoleUI ui;
    private final SpacecraftService spacecraftService;
    private final SimulationTripService simulationTripService;
    private Planet selectPlanet;
    private Spacecraft selectedCraft;

    // Constructor
    // Create depends on model and view
    public PlanetController(){
       this.planetSystem = new PlanetSystem();
       this.ui = new ConsoleUI();
       this.spacecraftService = new SpacecraftService();
       this.simulationTripService = new SimulationTripService();
    }

    // Method to start
    // Controller the flow of primary menu
    public void start(){
       boolean exit = false;
       int option;

       do{
           ui.showMenu(); // Called at method for show menu primary
           option = ui.readOptionMenu(); // Called at method for take option user

           switch (option){
               case 1 -> requestDestination();
               case 2 -> requestSpacecraft();
               case 3 -> simulationTrip();
               case 4 -> {
                   exit = true;
                   ui.exit();
               }
               default -> ui.showError("Opción no valida");
           }
       }while (!exit);
    }

    // Request destination for trip
    // Divide responsibilities into entry, business logic, and exit layers
    public void requestDestination(){

       String namePlanet = ui.readNamePlanet();
       Planet planet = planetSystem.searchPlanet(namePlanet);
       if (planet != null) {
           selectPlanet = planet; // We keep the planet admitted to interact with it
           ui.showPlanet(planet);
       }else{
           ui.showError("El planeta ingresado no existe.");
       }
    }

    // Method to request the Spacecraft
    public void requestSpacecraft(){

        // We verify that the user has chosen a planet
        if (selectPlanet != null ) {
            int option = ui.spacecraft(); // We show the menu of the spacecraft

            // The value is taken to choose the spacecraft
            switch (option){
                case 1 -> selectedCraft = new Ractor();
                case 2 -> selectedCraft = new Sultan();
                case 3 -> selectedCraft = new Orus();
                default -> {
                    ui.showError("Opción invalida.");
                }
            }
            // The number of people is taken
            int passengerCount = ui.requestPeople();
            String result = spacecraftService.assignPassengers(selectedCraft, passengerCount);
            ui.showMessage(result);
            // Message distance trip
            String travelMessage = spacecraftService.timeTrip(selectedCraft, selectPlanet);
            ui.showMessage(travelMessage);
        }else{
            ui.showError("Debes solicitar el viaje destino primero.");
        }
    }

    // Method trip simulation
    public void simulationTrip(){

        if (selectPlanet != null && selectedCraft != null){
            simulationTripService.travel(selectPlanet.getName(), selectedCraft);
        }else{
            ui.showError("Debes escoger el viaje y seleccionar la nave para poder comenzar con la simulación.");
        }
    }
}