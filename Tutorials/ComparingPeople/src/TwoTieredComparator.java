public class TwoTieredComparator implements PersonComparator {

  private PersonComparator first;
  private PersonComparator second;

  public TwoTieredComparator(PersonComparator first, PersonComparator second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public int compareTo(Person person1, Person person2) {
    int firstComp = first.compareTo(person1, person2);
    if (firstComp == 0) {
      return second.compareTo(person1, person2);
    }
    return firstComp;
  }
}
