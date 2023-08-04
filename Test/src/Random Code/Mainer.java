public class Mainer {
    public static void main(String[] args){
        System.out.println(secondsCalc(102, 136));
        System.out.println(secondsCalc(89403));


    }

    public static String secondsCalc(int seconds){
        if (seconds >= 60) {
            int minutes = seconds / 60;
            seconds -= minutes * 60;
            return secondsCalc(seconds, minutes);
        } else {
            return seconds + "s";
        }
    }

    public static String secondsCalc(int seconds, int minutes){
        int hours;
        int interimSeconds;
        if (minutes >= 60 || seconds >= 60){
            interimSeconds = seconds /60;
            minutes += interimSeconds;
            seconds = seconds % 60;
            hours = (minutes / 60);
            minutes -= hours * 60;
            return hours + "hrs " + minutes + "mins " + seconds + "s";
        } else if (minutes <= 0 || seconds <= 0) {
            return "Please enter a correct time format for seconds and minutes";
        } else {
            return "00hrs " + minutes + "mins " + seconds + "s";
        }
    }
}
