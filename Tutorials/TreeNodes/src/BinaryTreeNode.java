public class BinaryTreeNode<E> extends AbstractTreeNode<E> {

  private AbstractTreeNode<E> leftChild;
  private AbstractTreeNode<E> rightChild;

  public BinaryTreeNode(){
    this.leftChild = null;
    this.rightChild = null;
  }

  @Override
  public int getNumberOfChildren() {
    return 2;
  }

  @Override
  public AbstractTreeNode<E> getChild(int childIndex) {
    if (childIndex == 0) {
      return leftChild;
    }
    if (childIndex == 1) {
      return rightChild;
    }

    throw new IllegalArgumentException();

  }

  @Override
  public void setChild(int childIndex, AbstractTreeNode<E> child) {

    if (childIndex == 0) {
      leftChild = child;
    } else if (childIndex == 1){
      rightChild = child;
    } else {
      throw new IllegalArgumentException();
    }

  }
}
