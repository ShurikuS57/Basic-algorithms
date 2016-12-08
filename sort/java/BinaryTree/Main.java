package sort.java.BinaryTree;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(25);
        tree.insert(14);
        tree.insert(8);
        tree.insert(1);
        tree.insert(10);
        tree.traverseTree(BinaryTree.TraverseType.INORDER);
        System.out.println();
        tree.traverseTree(BinaryTree.TraverseType.POSTORDER);
        System.out.println();
        tree.traverseTree(BinaryTree.TraverseType.PREORDER);

        tree.delete(2);
        tree.delete(14);
        System.out.println();
        tree.traverseTree(BinaryTree.TraverseType.INORDER);

    }
}
