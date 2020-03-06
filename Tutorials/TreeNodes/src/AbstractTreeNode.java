public abstract class AbstractTreeNode<E> {

  protected E key;

  public E getKey() {
    return key;
  }

  public void setKey(E key) {
    this.key = key;
  }

  public abstract int getNumberOfChildren();

  public abstract AbstractTreeNode<E> getChild(int childIndex);

  public abstract void setChild(int childIndex, AbstractTreeNode<E> child);


  @Override
  public String toString() {
    StringBuilder result = new StringBuilder(key.toString());
    if (getNumberOfChildren() > 0) {
      result.append("(");
      for (int i = 0; i < getNumberOfChildren(); i++) {
        result.append(getChild(i));
        if (i < getNumberOfChildren() - 1) {
          result.append(", ");
        }
      }
      result.append(")");
    }
    return result.toString();
  }

}