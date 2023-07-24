public class printSquareCross {
    
    public static void main(String[] args) {
        printSquareStar(25);
    }

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
            number = -1;
        }
    
        int i = 0;
        //prints number amount of rows
        while(i < number){
            //prints the first and last row and fills with *
            if(i == 0 || i == number -1){
                //fills each column with a *
                for(int a = 0; a < number; a++){
                    System.out.print("*");
                }
                System.out.println();
                i++;
                continue;
            }
            //prints the body rows
            if(i != 0 || i != number - 1){
                //fills the columns
                for(int b = 1; b <= number; b++){
                    //fills first and last column with *
                    if(b == 1 || b == number){
                        System.out.print("*");
                    } else if (b == i + 1){
                        System.out.print("*");
                    } else if (b == (number - (i + 1) + 1)){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                i++;
                continue;
            }
        }
    }

    
}
