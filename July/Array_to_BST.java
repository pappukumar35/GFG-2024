package July;

public class Array_to_BST {
     public Node solve(int nums[], int s, int e) {
          if (s > e) {
               return null;
          }
          if (s == e) {
               return new Node(nums[s]);
          }

          int mid = s + (e - s) / 2;
          Node node = new Node(nums[mid]);
          node.left = solve(nums, s, mid - 1);
          node.right = solve(nums, mid + 1, e);
          return node;
     }

     public Node sortedArrayToBST(int[] nums) {
          // Code here
          return solve(nums, 0, nums.length - 1);
     }

     public Node solve(int nums[], int s, int e) {
          if (s > e) {
               return null;
          }
          if (s == e) {
               return new Node(nums[s]);
          }

          int mid = s + (e - s) / 2;
          Node node = new Node(nums[mid]);
          node.left = solve(nums, s, mid - 1);
          node.right = solve(nums, mid + 1, e);
          return node;
     }

     public Node sortedArrayToBST(int[] nums) {
          // Code here
          return solve(nums, 0, nums.length - 1);
     }

     public static void main(String[] args) {

     }

}
