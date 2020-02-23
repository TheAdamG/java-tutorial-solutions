public class TelephoneNumberComparator implements PersonComparator {

  @Override
  public int compareTo(Person person1, Person person2) {
    return person1.getTelephoneNo().compareTo(person2.getTelephoneNo());
  }

}
