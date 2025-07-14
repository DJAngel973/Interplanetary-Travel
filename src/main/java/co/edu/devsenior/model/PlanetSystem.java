package main.java.co.edu.devsenior.model;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Class that manages the planet system for the travel simulator
public class PlanetSystem {

    // List to store available planets
    private final List<Planet> planets;

    // Constructor: initializes planet list
    public PlanetSystem(){
        this.planets = new ArrayList<>();
        planetsInitial();
    }

    // Adds predefined planets with distance and message
    private void planetsInitial(){
        planets.add(new Planet("Marte", 225.00,"Conozcamos el planeta rojo\nEl cuarto planeta del sistema solar\nUn poco frio y desértico, con una atmosfera delgada y superficie polvorienta."));
        planets.add(new Planet("Júpiter", 628.00,"Conozcamos el planeta mas grande de nuestro sistema solar\nEl quinto en su orden\nUn gigante gaseoso con bandas de nubes arremolinadas\nCompuesto de hidrogeno y helio."));
        planets.add(new Planet("Saturno", 1430.00,"Conozcamos los sorprendentes anillos brillantes\nEl segundo planeta mas grande del sistema solar\nSexto planeta compuesto principalmente de hidrogeno y helio."));
    }

    // Returns an unmodifiable view of the planet list
    public List<Planet> getAllPlanets(){
        return Collections.unmodifiableList(this.planets);
    }

    // Searches for a planet by name and returns it if found
    public Planet searchPlanet(String name){
        for(Planet searchPlanetName : planets){
            if (removeTilde(searchPlanetName.getName().toLowerCase())
                    .equalsIgnoreCase(removeTilde(name.toLowerCase()))) {
                return searchPlanetName;
            }
        }
        return null;
    }
    // Normaliza text by removing diacritical marks (tildes) for accent-insensitive comparisons
    public static String removeTilde(String text){
        return Normalizer.normalize(text, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}", "");
    }
}
