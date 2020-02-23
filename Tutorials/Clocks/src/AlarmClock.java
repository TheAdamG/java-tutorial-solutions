public class AlarmClock extends Clock {

  private boolean isSounding;
  private long alarm;
  private int alarmTimer = 0;
  private String alarmNoise = " BEEP!";

  public AlarmClock(long secondsSinceMidnight, long alarm) {
    super(secondsSinceMidnight);
    this.isSounding = false;
    this.alarm = alarm;
  }

  public AlarmClock(
      int hour, int minutes, int seconds, int alarmHour, int alarmMinutes, int alarmSeconds) {
    super(hour, minutes, seconds);
    this.isSounding = false;
    this.alarm = alarmHour * 3600 + alarmMinutes * 60 + alarmSeconds;
  }

  @Override
  public void tick() {
    super.tick();
    if ((getSecondsSinceMidnight() >= alarm || alarmTimer > 0) && alarmTimer < 60) {
      isSounding = true;
      alarmTimer++;
    } else {
      isSounding = false;
      alarmTimer = 0;
    }

  }

  @Override
  public String toString() {
    return isSounding ? super.toString() + alarmNoise : super.toString();
  }

  protected void setAlarmNoise(String alarmNoise) {
    this.alarmNoise = alarmNoise;
  }

  public static void main(String[] args) throws InterruptedException {
    Clock clock = new AlarmClock(23, 59, 55, 23, 59, 58);
    while (true) {
      System.out.println(clock);
      Thread.sleep(1000);
      clock.tick();
    }
  }

}
