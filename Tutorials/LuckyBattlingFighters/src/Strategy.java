public enum Strategy {
  AGGRESSIVE (2, 5),
  DEFENSIVE(5, 2),
  AVERAGE(3, 3);

  private final int aggressive;
  private final int defensive;

  Strategy(int aggressive, int defensive) {
    this.aggressive = aggressive;
    this.defensive = defensive;
  }

  public int getAggressive() {
    return aggressive;
  }

  public int getDefensive() {
    return defensive;
  }
}
