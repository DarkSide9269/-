package Lab3_Iluk_Artem_372;

public class Clock {
    private int hour;
    private int minute;

    public Clock() {}

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute; }

    public void nextMinute() {
        minute++;
        if (minute > 59) {
            minute = 0;
            hour++;
            if (hour > 23) {
                hour = 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Clock(" + "hour=" + hour + ", minute=" + minute + ')';
    }
}