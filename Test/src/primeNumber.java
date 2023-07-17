public class primeNumber{

    public static void main(String[] args) {
        int count = 0;
        int limit = 100000;
        for(int number = 2; number < limit; number++){
            if(isPrime(number)){
                count += 1;
            }
        }
        System.out.println("There are "+count+" prime numbers up to " + limit);
    }

    public static boolean isPrime(int number){
        for(int i = 2; i < (number / 2 ) + 1; i ++){
            if(number % i == 0){
                return false;
            }
        }
        System.out.println(number);
        return true;
    }
}