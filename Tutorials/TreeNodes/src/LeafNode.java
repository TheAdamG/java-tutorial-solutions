public class LeafNode<E> extends AbstractTreeNode<E> {


  @Override
  public int getNumberOfChildren() {
    return 0;
  }

  @Override
  public AbstractTreeNode<E> getChild(int childIndex) {
    return null;
  }

  @Override
  public void setChild(int childIndex, AbstractTreeNode<E> child) {
    //Deliberately does nothing
  }
}
