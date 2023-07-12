public class Main {
    public static void main(String[] args){
        int score = 5000;
        int roundsPlayed = 6;


        calcScore(score, roundsPlayed);
    }

    public static int calcScore(int score, int roundsPlayed){
        int bonus = 150;
        int finalScore = score + (roundsPlayed * bonus);
        System.out.println("Wow you scored " + finalScore + " points");
        return finalScore;
    }
}
