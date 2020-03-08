public interface NumberParser<E extends Number> {

  // Convert String s into a Number of type E
  public E parseNumber(String s);

  // Return the name of the type to which E corresponds.  E.g., if E is Integer,
// the method should return "int"
  public String typeParsed();

}
