package Kapitel_2_exercises.Exercise_2_8;

public class Exercise_2_8 {

    public static class ShowCurrentTime {
        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;




    }

    void ShowCurrentTime() {

    }

}
