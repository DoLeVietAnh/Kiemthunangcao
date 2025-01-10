import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeUtilsTest {

    @Test
    void testContainsValue_Found() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(20);

        assertTrue(BinaryTreeUtils.containsValue(root, 7));
    }

    @Test
    void testContainsValue_Root() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(20);

        assertTrue(BinaryTreeUtils.containsValue(root, 10));
    }

    @Test
    void testContainsValue_NotFound() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(20);

        assertFalse(BinaryTreeUtils.containsValue(root, 12));
    }

    @Test
    void testContainsValue_EmptyTree() {
        assertFalse(BinaryTreeUtils.containsValue(null, 10));
    }

    @Test
    void testContainsValue_SingleNode_Found() {
        TreeNode singleNode = new TreeNode(10);
        assertTrue(BinaryTreeUtils.containsValue(singleNode, 10));
    }

    @Test
    void testContainsValue_SingleNode_NotFound() {
        TreeNode singleNode = new TreeNode(10);
        assertFalse(BinaryTreeUtils.containsValue(singleNode, 20));
    }

    @Test
    void testContainsValue_LeafNode() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(20);

        assertTrue(BinaryTreeUtils.containsValue(root, 20));
    }

    @Test
    void testContainsValue_DuplicateValues() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(7); // Changed value to 7
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(20);

        assertTrue(BinaryTreeUtils.containsValue(root, 7));
    }

    @Test
    void testContainsValue_UnbalancedTree() {
        TreeNode unbalancedRoot = new TreeNode(10);
        unbalancedRoot.left = new TreeNode(5);
        unbalancedRoot.left.left = new TreeNode(3);
        unbalancedRoot.left.left.left = new TreeNode(1);

        assertTrue(BinaryTreeUtils.containsValue(unbalancedRoot, 1));
    }

    @Test
    void testContainsValue_NegativeValues() {
        TreeNode negativeRoot = new TreeNode(-10);
        negativeRoot.left = new TreeNode(-20);
        negativeRoot.right = new TreeNode(-5);
        negativeRoot.right.left = new TreeNode(-15);

        assertTrue(BinaryTreeUtils.containsValue(negativeRoot, -15));
    }

    @Test
    void testContainsValue_LargeTree() {
        TreeNode largeTree = new TreeNode(50);
        largeTree.left = new TreeNode(30);
        largeTree.right = new TreeNode(70);
        largeTree.left.left = new TreeNode(20);
        largeTree.left.right = new TreeNode(40);
        largeTree.right.left = new TreeNode(60);
        largeTree.right.right = new TreeNode(80);

        assertTrue(BinaryTreeUtils.containsValue(largeTree, 80));
    }
}