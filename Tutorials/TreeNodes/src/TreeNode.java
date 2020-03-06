public class TreeNode<E> extends AbstractTreeNode<E> {

  private AbstractTreeNode<E>[] children;

  @SuppressWarnings("unchecked")
  public TreeNode(int numberOfChildren) {
    children = (AbstractTreeNode<E>[]) new AbstractTreeNode[numberOfChildren];
  }

  public int getNumberOfChildren() {
    return children.length;
  }

  public AbstractTreeNode<E> getChild(int childIndex) {
    return children[childIndex];
  }

  @Override
  public void setChild(int childIndex, AbstractTreeNode<E> child) {
    children[childIndex] = child;
  }



}