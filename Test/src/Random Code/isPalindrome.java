public class isPalindrome {
    
    public static void main(String[] args) {
        System.out.println(palindrome(11));
        System.out.println(palindrome(12321));
        System.out.println(palindrome(-11));
        System.out.println(palindrome(1261));
        System.out.println(palindrome(0));
    }

    public static boolean palindrome(int number){
        int reverse = 0;
        if(number < 0){
            number = number * -1;
        }
        int i = number;
        while(i > 0){
            reverse = reverse * 10;
            reverse += i % 10;
            i = i / 10;
        }
        if(reverse == number){
            return true;
        } else {
            return false;
        }
    }
}
