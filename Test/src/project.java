public class project {
    public static void main(String[] args) {

        for(double rate = 7.0; rate <= 10.0; rate += 0.25){
            System.out.println(calcInterest(100,rate));
        }
    }

    public static double calcInterest(double principle, double rate){
        double total = principle + principle * (rate / 100);
        return total;
    }
    
}
