package java_fundamentals.conditionals;
import java.util.Scanner;
public class VipLounge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("THE VIP LOUNGE");
        System.out.print("Age: ");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.print("Do you have a VIP Pass? yes/no: ");
            String vipPassReply = scanner.next();

            if(vipPassReply.equals("yes") || age >= 70){
                System.out.println("Thanks, go in. ");
            }else{
                System.out.println("Sorry, you must either be over 70 or have a VIP Pass. ");
            }
        }else{
            System.out.println("Sorry, yo must be over 18. ");
        }




        //System.out.print((age >= 18 && vipPassReply.equals("yes")) ? "Thanks, go in" : "Sorry, no can do");

    }
}
