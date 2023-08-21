package java_fundamentals.loops;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodingChallenge4 {
    public static void main(String[] args) {
        //Coding Challenge 4 - Loops
        // ----------------------Exercise 1--------------------------
        /*
        for (int i=89; i<=117; i++){
            System.out.println(i);
        }
        */

        //-----------------------Exercise 2---------------------------
        /*
        int count = 0;
        for (int i=1; i<=40; i++){
            System.out.println(i);

            count++;
            if(count == 3){
                System.out.println("Quack");
                count = 0;
            }
        }
        */
        //-----------------------Exercise 3---------------------------
        /*
        Scanner scanner = new Scanner(System.in);
        String pass;

        do{
            System.out.print("Escribe la contraseña: ");
            pass = scanner.nextLine();

        }while (!pass.equals("shark50"));

        System.out.print("ACCESS APPROVED");
        */
        //--------------------Exercise 4 -------------------
        //Same as 1

        //--------------------Exercise 5 and 6 -------------------
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);

        Scanner scanner = new Scanner(System.in);
        int numeroAdivinado;
        int count = 0;

        do{
            System.out.print("Adivina en qué número estoy pensando, del 1 al 100: ");
            numeroAdivinado = scanner.nextInt();
            if(numeroAdivinado < randomNumber) System.out.println("HIGHER");
            else if (numeroAdivinado > randomNumber) System.out.println("LOWER");
            count++;

        }while(randomNumber != numeroAdivinado);

        System.out.format("CORRECT! number is: %d ", randomNumber);
        System.out.println();
        System.out.format((count == 1 ? "It was %d attempt" : "It were %d attempts"), count);
    }
}
