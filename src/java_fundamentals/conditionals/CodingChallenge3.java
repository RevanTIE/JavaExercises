package java_fundamentals.conditionals;
import java.util.Scanner;

public class CodingChallenge3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el valor 1: ");
        int valor1 = scanner.nextInt();

        System.out.print("Escribe el valor 2: ");
        int valor2 = scanner.nextInt();

        if(valor1 > valor2){
            System.out.format("El valor %d es mayor que el valor %d, y su diferencia es de %d ", valor1, valor2, valor1 - valor2);
        }else if (valor1 < valor2)
        {
            System.out.format("El valor %d es menor que el valor %d, y su diferencia es de %d ", valor1, valor2, valor2 - valor1);
        }else {
            System.out.println("El valor es el mismo.");
        }


    }
}
