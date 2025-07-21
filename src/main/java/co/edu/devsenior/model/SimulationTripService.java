package main.java.co.edu.devsenior.model;

public class SimulationTripService {

    public void travel(String planetName, Spacecraft spacecraft){

        int interval = 10; // Progress will increase in intervals of 10%

        for (int i = 0; i <= 100; i+= interval){
            // We apply a delay to generate a small pause
            try{
                Thread.sleep(1000); // half a second for each step
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            // Message travel process
            if(i == 0){
                System.out.println("🚀 Despegando... 🚀\n");
            }else if (i == 20){
                System.out.printf("20%% Distancia recorrida, a %.0fKm/h...\n", spacecraft.speed);
            }else if (i == 50){
                System.out.printf("50%% Vamos a mita del viaje, a %.0fKm/h...\n", spacecraft.speed);
            }else if (i == 80){
                System.out.printf("80%% Preparando entrada a area de %s a %.0fKm/h...\n", planetName, spacecraft.speed);
            }else if (i == 100){
                System.out.printf("\uD83C\uDFC1\uD83C\uDFC1 100%% Llegada al destino: %s \uD83C\uDFC1\uD83C\uDFC1\n", planetName);
            }else {
                System.out.println("Proceso del viaje " + i + "%");
            }
        }
    }
}
