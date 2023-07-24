import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        int z = 1/ 0;
        int a = 1;
        double b = (double) a;
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        int smallest = 0;
        while(running){
            System.out.println("Please enter a number to log, or a letter to exit");
            
            try{
                int number = Integer.parseInt(scanner.nextLine());
                if(number < smallest){
                    smallest = number;
                } else if (number > largest){
                    largest = number;
                } else if (largest == 0 && smallest == 0){
                    largest = number;
                    smallest = number;
                }
            } catch (NumberFormatException nfe){
                System.out.println("Your largest number was " + largest);
                System.out.println("Your smallest number was "+ smallest);
                running = false;
            }
        }
    }
}
