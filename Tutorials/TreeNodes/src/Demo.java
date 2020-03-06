public class Demo {

  public static void main(String[] args) {

    final AbstractTreeNode<String> root = new TreeNode<>(4);
    final AbstractTreeNode<String> child0 = new BinaryTreeNode<String>();
    final AbstractTreeNode<String> child1 = new BinaryTreeNode<String>();
    final AbstractTreeNode<String> child2 = new LeafNode<String>();
    final AbstractTreeNode<String> child3 = new LeafNode<String>();
    final AbstractTreeNode<String> child00 = new LeafNode<String>();
    final AbstractTreeNode<String> child01 = new LeafNode<String>();
    final AbstractTreeNode<String> child10 = new LeafNode<String>();
    final AbstractTreeNode<String> child11 = new BinaryTreeNode<String>();
    final AbstractTreeNode<String> child110 = new LeafNode<String>();
    final AbstractTreeNode<String> child111 = new LeafNode<String>();

    root.setKey("Animal");
    child0.setKey("Reptile");
    child1.setKey("Bird");
    child2.setKey("Mammal");
    child3.setKey("Insect");
    child00.setKey("Lizard");
    child01.setKey("Salamander");
    child10.setKey("Raven");
    child11.setKey("Finch");
    child110.setKey("Gold finch");
    child111.setKey("Green finch");

    root.setChild(0, child0);
    root.setChild(1, child1);
    root.setChild(2, child2);
    root.setChild(3, child3);

    child0.setChild(0, child00);
    child0.setChild(1, child01);

    child1.setChild(0, child10);
    child1.setChild(1, child11);

    child11.setChild(0, child110);
    child11.setChild(1, child111);

    System.out.println("Incomplete tree of life:");
    System.out.println(root);
  }
}
