package Chapter10;

public class TimeClient {
    public static void main(String[] args) {
        Time t = new Time(555550000);
        Time t2 = new Time();
        System.out.println(t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());

        System.out.println(t.getHour() + ":" + t.getMinute() + ":" + t.getSecond());
    }
}
