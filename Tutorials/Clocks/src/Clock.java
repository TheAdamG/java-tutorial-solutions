public class Clock {

  private long secondsSinceMidnight;
  private boolean twentyFourHour;

  public Clock(long secondsSinceMidnight) {
    this.secondsSinceMidnight = secondsSinceMidnight;
    this.twentyFourHour = false;
  }

  public Clock (int hour, int minutes, int seconds) {
    this.secondsSinceMidnight = hour * 3600 + minutes * 60 + seconds;
    this.twentyFourHour = true;
  }

  public void tick() {
    secondsSinceMidnight ++;
    if (secondsSinceMidnight > 86399) {
      secondsSinceMidnight = secondsSinceMidnight - 86400;
    }
  }


  @Override
  public String toString() {
    if (!twentyFourHour) {
      return secondsSinceMidnight + " seconds since midnight.";
    }

    long hour = secondsSinceMidnight / 3600;
    long minutes = (secondsSinceMidnight % 3600) / 60;
    long seconds = (secondsSinceMidnight % 3600) % 60;

    String hourString =  (hour < 10) ? "0" + hour : String.valueOf(hour) ;
    String minuteString =  (minutes < 10) ? "0" + minutes : String.valueOf(minutes) ;
    String secondsString =  (seconds < 10) ? "0" + seconds : String.valueOf(seconds) ;

    return (hourString + ":" + minuteString + ":" + secondsString);

  }

  public void setDisplayMode(boolean twentyFourHour) {
    this.twentyFourHour = twentyFourHour;
  }

  protected long getSecondsSinceMidnight() {
    return secondsSinceMidnight;
  }

  public static void main(String[] args) throws InterruptedException {
    Clock clock = new Clock(23, 59, 55);
    while (true) {
      System.out.println(clock);
      Thread.sleep(1000);
      clock.tick();
    }
  }
}
