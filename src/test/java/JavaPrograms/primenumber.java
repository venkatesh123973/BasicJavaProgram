package JavaPrograms;

import org.testng.annotations.Test;

public class primenumber {

    @Test
    public void primenumbers(){

        System.out.println("Prime numbers between 1 and 20:");

        for (int num = 2; num <= 20; num++) {
            boolean isPrime = true;
            // Check if the number is divisible by any number other than 1 and itself
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            // Print the number if it is prime
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
