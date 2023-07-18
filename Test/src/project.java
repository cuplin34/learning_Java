public class project {
    public static void main(String[] args) {
    }

    public static int sumDigits (int number){
        int digit = 0;
        if(number < 0 ){
            return -1;
        } else if (number <= 9){
            return number;
        } else{
            while(number > 0){
                digit += number % 10;
                number = number / 10;
            }
            return digit;
        }
    }
}
