package java_fundamentals.conditionals;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height in cm: ");
        int height = scanner.nextInt();
        /*
        if(height < 130){
            System.out.print("Sorry, you are too short");
        }
        else {
            System.out.print("Height accepted. Go ahead");
        }
        */
        //System.out.print((height < 130 || height > 210) ? "Sorry, you do not meet the height requirements" : "Height accepted. Go ahead");

        System.out.print((height > 130 && height < 210) ? "Height accepted. Go ahead" : "Sorry, you do not meet the height requirements");

    }
}
