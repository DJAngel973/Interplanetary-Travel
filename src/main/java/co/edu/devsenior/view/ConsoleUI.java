package main.java.co.edu.devsenior.view;

import main.java.co.edu.devsenior.model.Planet;
import java.util.Scanner;

/*
* Menu for initial user interaction.You can choose the action you want to perform
* (select a planet, choose a ship, start the journey, or exit the program)
* */

public class Start{

    // We instantiate the class main.java.co.edu.devsenior.model.PlanetSystem
    static PlanetSystem planetSystem = new PlanetSystem();

    public static void main(String[] args) {

        var input = new Scanner(System.in); // Take datas
        boolean exit = false;
        int option;

        // Main menu
        do{
            System.out.print("""
                    -------------------------------------------
                    ΩΦδΩΦδΩΦδΩΦδΩΦδ Bienvenidos ΩΦδΩΦδΩΦδΩΦδΩΦδ
                    -------------------------------------------
                    ΩΦδΩ Organiza tu viaje interplanetario ΩΦδΩ
                    -------------------------------------------
                    1. Solicitar viaje destino.
                    2. Escoger nave espacial.
                    3. Comenzar simulación.
                    4. Salir
                    -------------------------------------------
                    Escoge una opción: """);
            option = input.nextInt();
            input.nextLine();

            // The option chosen by the user is executed
            switch (option) {
                case 1:
                    requestRide(planetSystem);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    // Exit menu
                    exit = true;
                    System.out.println("-------------------------------------------");
                    System.out.println("-Ω-Φ-δ-Ω- Gracias por participar. -Ω-Φ-δ-Ω-");
                    break;
                default:
                    // Incorrectly entered data, then the data is requested again
                    System.out.println("-------------------------------------------");
                    System.out.println("-Ω-Φ-δ-Ω Ingresa una opción valida -Ω-Φ-δ-Ω");
                    break;
            }
        }while(!exit);
    }

    // Request trip destination
    public static void requestRide(PlanetSystem planetSystem){

        String userPlanet;
        var input = new Scanner(System.in);

        // Select option user
        System.out.print("""
                -------------------------------------------
                Nuestros destinos:
                φ-φ-φ Marte
                δ-δ-δ Júpiter
                Φ-Φ-Φ Saturno
                Escribe el planeta donde quieres ir: """);
        userPlanet = input.nextLine();

        //
        Planet option = planetSystem.searchPlanet(userPlanet);

        // Verify option user
        if (option != null){
            System.out.printf("""
                            -------------------------------------------
                            -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ
                            
                            %s
                            Con una distancia promedio de %.2f millones de kilómetros
                            %s
                            
                            -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ
                            -------------------------------------------
                            """, option.getName(), option.getDistance(), option.getMessage());
        }else{
            System.out.println("El planeta ingresado no existe.");
        }
    }
}