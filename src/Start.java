
import java.util.Scanner;

/*
* Menu for initial user interaction.You can choose the action you want to perform
* (select a planet, choose a ship, start the journey, or exit the program)
* */

public class Start{
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
}