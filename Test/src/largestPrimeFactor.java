public class largestPrimeFactor {
    // method to return largest prime factor of a number

    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }
        int prime = 0;
        boolean primeness = true;
        for(int i = 1; i <= (number /2); i++){
            if(number % i == 0){
                for(int a = 2; a < i; a++){
                    if(i%a == 0 && primeness){
                        primeness = false;
                    }
                }
            if(primeness){
                prime = i;
            }
            primeness = true;
            }
        }
        if(prime == 1){
            prime = number;
        }
        return prime;
    }
}

