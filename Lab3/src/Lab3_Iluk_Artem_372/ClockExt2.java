package Lab3_Iluk_Artem_372;

public class ClockExt2 extends ClockExt {
    private int millisecond;

    public ClockExt2() {
        super();
    }

    public ClockExt2(int hour, int minute, int second, int millisecond) {
        super(hour, minute, second);
        this.millisecond = millisecond;
    }

    public void nextMillisecond() {
        millisecond += 100;
        if (millisecond >= 1000) {
            nextSecond();
            millisecond = 0;
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Електронний Годинник | Години: %02d | Хвилини: %02d | Секунди: %02d | Мілісекунди: %03d",
                getHour(), getMinute(), getSecond(), millisecond
        );
    }
}