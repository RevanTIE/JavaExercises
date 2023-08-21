package java_fundamentals.variables;

public class Operations {

    public static void main(String[] args) {
        /*
        int x = 20;
        double y = 20.5;
        char unicode = '\u005A';
        String texto = "hola mundo ";
        boolean input = false;

        Scanner sc = new Scanner(System.in);

        while(!input){
            System.out.print("¿Usted cuénta con licencia de manejo? ");
            input = parseBoolean(sc.nextLine());
            System.out.println(input ? "Tiene licencia" : "No tiene licencia");
        }
        */
        int x = 20;
        double y = 20.5;
        System.out.format("La división de %d entre %.2f es %.2f", x, y, x/y);

    }
}
