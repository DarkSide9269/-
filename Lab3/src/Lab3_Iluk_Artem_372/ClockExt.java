package Lab3_Iluk_Artem_372;

public class ClockExt extends Clock {

    private int second;

    public ClockExt() {
        super();
    }

    public ClockExt(int hour, int minute, int second) {
        super(hour, minute);
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void nextSecond() {
        second++;
        if (second > 59) {
            second = 0;
            super.nextMinute();
        }
    }

    @Override
    public String toString() {
        return "ClockExt("
                + "hour=" + getHour()
                + ", minute=" + getMinute()
                + ", second=" + second
                + ')';
    }
}