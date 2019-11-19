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
    public void setTime(long elapsedTime) {
        time = elapsedTime;
    }

    public int getHour() {
        return (int) (time / (60 * 60 * 1000)) % 24;
    }

    public int getMinute() {
        return (int) (time / (60 * 1000)) % 60;
    }

    public int getSecond() {
        return (int)(time / 1000) % 60;
    }

}
