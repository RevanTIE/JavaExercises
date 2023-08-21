package java_fundamentals.conditionals;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodingChallenge3Game {
    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adivina en qué número estoy pensando, del 1 al 5: ");
        int numeroAdivinado = scanner.nextInt();

        lanzarDados(randomNumber, numeroAdivinado, scanner);

    }
    public static void lanzarDados(int randomNumber, int numeroAdivinado, Scanner scanner){
        if(numeroAdivinado==randomNumber){
            System.out.format("Correcto, el número que pensé es el %d ", randomNumber);
        }else {
                System.out.format("Incorrecto, el número que pensé es el %d, intentalo de nuevo: ", randomNumber);
                int segundaOportunidad = scanner.nextInt();
                lanzarDados(randomNumber, segundaOportunidad, scanner);

        }
    }

}
