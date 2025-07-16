package main.java.co.edu.devsenior.controller;

import main.java.co.edu.devsenior.model.Planet;
import main.java.co.edu.devsenior.model.PlanetSystem;
import main.java.co.edu.devsenior.view.ConsoleUI;

public class PlanetController {

    // Attributes
    private final PlanetSystem planetSystem;
    private final ConsoleUI ui;

    // Constructor
    // Create depends on model and view
   public PlanetController(){
       this.planetSystem = new PlanetSystem();
       this.ui = new ConsoleUI();
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
               case 2 -> {}
               case 3 -> {}
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
           ui.showPlanet(planet);
       }else{
           ui.showError("El planeta ingresado no existe.");
       }
   }
}