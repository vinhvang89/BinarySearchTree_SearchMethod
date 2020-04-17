public class Test {
    public static void main(String[] args) {
      IntegerTree tree = new IntegerTree();
      tree.insert(33);
      tree.insert(12);
      tree.insert(93);
      tree.insert(313);
      tree.insert(331);
      tree.inorder();
        System.out.println(tree.isInTree(323));
    }
}
