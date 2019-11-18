package Chapter10;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private long time;

    public Time() {
        time = System.currentTimeMillis();
    }

    public Time(long zTime) {
        time = zTime;

    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

}
