public class ArrayRotation {
    public static void rotateArray(int[] nums, int rotationCount) {
        int length = nums.length;
        
        // Reduce the rotation count to avoid unnecessary rotations
        rotationCount = rotationCount % length;
        
        // Reverse the entire array
        reverseArray(nums, 0, length - 1);
        
        // Reverse the first 'rotationCount' elements
        reverseArray(nums, 0, rotationCount - 1);
        
        // Reverse the remaining elements
        reverseArray(nums, rotationCount, length - 1);
    }
    
    private static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int rotationCount = 2;
        
        rotateArray(nums, rotationCount);
        
        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}