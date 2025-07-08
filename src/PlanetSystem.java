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
        planets.add(new Planet("Marte", 225,"Conozcamos el planeta rojo, el cuarto planeta del sistema solar, un poco frio y desértico, con una atmosfera delgada y una superficie polvorienta."));
        planets.add(new Planet("Júpiter", 628,"Conozcamos el planeta mas de nuestro sistema solar, el quinto en su orden, un gigante gaseoso con bandas de nubes arremolinadas, compuesto de hidrogeno y helio."));
        planets.add(new Planet("Saturno", 1430,"Conozcamos los sorprendentes anillos brillantes del segundo planeta mas grande del sistema solar, sexto planeta compuesto principalmente de hidrogeno y helio."));
    }

    // Returns an unmodifiable view of the planet list
    public List<Planet> getAllPlanets(){
        return Collections.unmodifiableList(this.planets);
    }

    // Searches for a planet by name and returns it if found
    public Planet searchPlanet(String name){
        for(Planet searchPlanetName : planets){
            if (searchPlanetName.getName().equalsIgnoreCase(name)){
                return searchPlanetName;
            }
        }
        return null;
    }
}
