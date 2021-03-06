public class Main {

    public static void main(String[] args){


        String time = getDurationString(65, 45);
        String time2 = getDurationString(1000);
        System.out.println(time);
        System.out.println(time2);


    }

    public static String getDurationString(int minutes, int seconds){

        if((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return "Invalid Value";
        }

        int hours = (minutes / 60);
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + " m " + seconds + " s";
    }

    public static String getDurationString(int seconds){
        if((seconds < 0)){
            return "Invalid Value";
        }

        int minutes = (seconds / 60);
        int remainingSeconds = (seconds % 60);

        return getDurationString(minutes, remainingSeconds);
    }

}
