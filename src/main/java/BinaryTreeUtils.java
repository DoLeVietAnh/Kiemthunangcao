public class BinaryTreeUtils {
    public static boolean containsValue(TreeNode root, int value) {
        if (root == null) return false;  // Cây rỗng
        if (root.val == value) return true;  // Giá trị tìm thấy
        return containsValue(root.left, value) || containsValue(root.right, value);
    }
}