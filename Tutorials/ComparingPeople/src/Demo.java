import java.util.HashSet;
import java.util.Set;

public class Demo {

  public static void main(String[] args) {
    Person person1 = new Person("aaa", "abc", "00111");
    Person person2 = new Person("aaa", "abc", "111000");
    Person person3 = new Person("aaa", "aaa", "00000");

    /*System.out.println(new SurnameComparator().compareTo(person1, person2));
    System.out.println(new ForenameComparator().compareTo(person1, person2));
    System.out.println(new TelephoneNumberComparator().compareTo(person1, person2)); */
    /*
    Set<Person> testSet = new HashSet<>();
    testSet.add(person1);
    testSet.add(person2);
    testSet.add(person3);

    System.out.println(findMin(testSet, new SurnameComparator()));
    System.out.println(findMin(testSet, new ForenameComparator()));
    System.out.println(findMin(testSet, new TelephoneNumberComparator())); */


    PersonComparator twoTieredComparator = new TwoTieredComparator(new SurnameComparator(),
        new ForenameComparator());

    // Expecting positive
    System.out.println(twoTieredComparator.compareTo(person1, person3));

    PersonComparator threeTieredComparator = new TwoTieredComparator(twoTieredComparator,
        new TelephoneNumberComparator());

    // Expecting negative
    System.out.println(threeTieredComparator.compareTo(person1, person2));
  }

  public static Person findMin(Set<Person> people, PersonComparator comparator) {
    Person minPerson = people.toArray(Person[]::new)[0];

    for (Person person : people) {
      if (comparator.compareTo(person, minPerson) < 0 ) {
        minPerson = person;
      }
    }

    return minPerson;

  }


}
