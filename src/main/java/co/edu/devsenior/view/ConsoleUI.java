package main.java.co.edu.devsenior.view;

import main.java.co.edu.devsenior.model.Planet;
import java.util.Scanner;

/*
* Menus for user interaction and data entry
* */

public class ConsoleUI {

    // Create variable for take data user
    private final Scanner input = new Scanner (System.in);

    // Method for show menu at user
    public void showMenu(){
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
    }

    // Method for take the option of menu user
    public int readOptionMenu(){
        return input.nextInt();
    }

    // Method for take planet
    public String readNamePlanet(){
        System.out.print("""
                -------------------------------------------
                Nuestros destinos:
                φ-φ-φ Marte
                δ-δ-δ Júpiter
                Φ-Φ-Φ Saturno
                Escribe el planeta donde quieres ir: """);
        input.nextLine(); // Clear buffer
        return input.nextLine();
    }

    // Method for show characteristics of planet
    public void showPlanet(Planet planet){
        System.out.printf("""
                            -------------------------------------------
                            -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ
                            
                            %s
                            Con una distancia promedio de %.2f millones de kilómetros
                            %s
                            
                            -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ -φ-δ-Φ
                            -------------------------------------------
                            """, planet.getName(), planet.getDistance(), planet.getMessage());
    }

    // Method message of error
    public void showError(String messageError){
        System.out.println(" " + messageError);
    }

    // Method for message of exit project
    public void exit(){
        System.out.println("-------------------------------------------");
        System.out.println("-Ω-Φ-δ-Ω- Gracias por participar. -Ω-Φ-δ-Ω-");
    }

    // Method of message from spacecraft available for travel
    public int spacecraft(){

        int option;
        System.out.println("""
                -------------------------------------------
                -Ω-Φ-δ-Ω-Φ- Naves disponibles:   -Ω-Φ-δ-Ω-Φ
                
                1. Ractor
                🚀 Velocidad maxima 385 km/h
                🙍 Capacidad 10 pasajeros
                
                2. Sultan
                🚀 Velocidad maxima 315 km/h
                🙍 Capacidad 15 pasajeros
                
                3. Orus
                🚀 Velocidad maxima 270 km/h
                🙍 Capacidad 25 pasajeros
                
                Escoge la nave espacial:
                """);
        return input.nextInt();
    }

    // Method to request number of people
    public int requestPeople(){
        System.out.print("Ingresa número de personas para el viaje: ");
        return input.nextInt();
    }

    // Method message
    public void showMessage(String message){
        System.out.println(message);
    }
}