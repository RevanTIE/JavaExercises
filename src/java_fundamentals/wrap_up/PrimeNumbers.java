package java_fundamentals.wrap_up;

public class PrimeNumbers {
    public static void main(String[] args) {
        for(int num = 1; num < 500000; num++)
        {
            boolean isPrime = true;
            for(int div=2; div * div <= num; div++){
                if(num % div == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num);
            }
        }
    }

}
