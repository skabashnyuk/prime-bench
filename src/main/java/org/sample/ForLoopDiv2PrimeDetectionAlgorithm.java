package org.sample;

public class ForLoopDiv2PrimeDetectionAlgorithm implements PrimeDetectionAlgorithm {
    @Override
    public boolean isPrime(int number) {
        if(number == 2 ){
            return true;
        }
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            // condition for nonprime number
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }
}
