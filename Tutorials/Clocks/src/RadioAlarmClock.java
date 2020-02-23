public class RadioAlarmClock extends AlarmClock {

  private Station station;



  public RadioAlarmClock(long secondsSinceMidnight, long alarm, Station station) {
    super(secondsSinceMidnight, alarm);
    this.station = station;
    setAlarmNoise(station.getStationMessage());
  }

  public RadioAlarmClock(int hour, int minutes, int seconds, int alarmHour, int alarmMinutes,
      int alarmSeconds, Station station) {
    super(hour, minutes, seconds, alarmHour, alarmMinutes, alarmSeconds);
    this.station = station;
    setAlarmNoise(station.getStationMessage());
  }

  public static void main(String[] args) throws InterruptedException {
    Clock clock = new RadioAlarmClock(23, 59, 55, 23, 59, 58, Station.Radio4);
    while (true) {
      System.out.println(clock);
      Thread.sleep(1000);
      clock.tick();
    }
  }


}
