package java_fundamentals.poo;

public class CallingMonths {
    public static void main(String[] args) {
        for(Month Selectedmonth : Month.values()){ //Ejemplo de foreach
            whichSeason(Selectedmonth);
        }


    }
    public static void whichSeason(Month month){
        switch (month){
            case DECEMBER, JANUARY, FEBRUARY -> System.out.printf("%s is in the winter season.\n", month);
            case MARCH, APRIL, MAY -> System.out.printf("%s is in the spring season.\n", month);
            case JUNE, JULY, AUGUST -> System.out.printf("%s is in the fall season.\n", month);
            case SEPTEMBER, OCTOBER, NOVEMBER -> System.out.printf("%s is in the autum season.\n", month);
        }
    }
}
