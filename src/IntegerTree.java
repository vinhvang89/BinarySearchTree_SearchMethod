public class IntegerTree {
    Node root;
    int size;

    public IntegerTree() {

    }

    private static class Node {
        Node left;
        Node right;
        int number;
        public Node(int number) {
            this.number = number;
        }
    }

    public void insert(int number) {
        if( root == null)
            root = new Node(number);
        else {
            Node parent = null;
            Node current = root;
            while (current != null){
                if( number < current.number){
                    parent = current;
                    current = current.left;
                } else if(number > current.number) {
                    parent = current;
                    current = current.right;
                } else
                    System.out.println("Cant insert " +number);
            }
            if( number < parent.number)
                parent.left = new Node(number);
            else if( number > parent.number)
                parent.right = new Node(number);
            else
                System.out.println("Cant insert " +number);
            }
        size++;
    }
    public boolean isInTree(int number){
        if ( root == null)
            return false;
        else {
            Node parent = null;
            Node current = root;
            if( current.number == number)
                return true;
            else {
                while (current!= null) {
                    if (number < current.number) {
                        parent = current;
                        current = current.left;
                    } else if(number > current.number) {
                        parent = current;
                        current = current.right;
                    } else
                        return true;
                }
               return parent.number == number;
            }
        }
    }
    public void inorder(){
        inorder(root);
    }
    protected void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print( root.number + " , ");
        inorder(root.right);
    }

}