public enum Station {

  None (" BEEP!"),
  Radio4(" Blah, blah, blah"),
  FiveLive(" ...and it's a GOAL!!");

  private final String stationMessage;

  Station (String stationMessage) {
    this.stationMessage = stationMessage;
  }

  public String getStationMessage() {
    return stationMessage;
  }
}
