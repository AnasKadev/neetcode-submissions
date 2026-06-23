class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        
        
        while (l <= r) {
            int mid = l + (r - l) / 2; // Avoid overflow

            if (nums[mid] == target) {
                return true; // Found target, return index
            } else if (nums[mid] < target) {
                l = mid + 1; // Target is in the right half
            } else {
                r = mid - 1; // Target is in the left half
            }
        }
        
        return false; // Target not found
    }
    public boolean searchMatrix(int[][] matrix, int target) {
       int row=0;
       for(int d=0;d<matrix.length;d++){
       if(matrix[d][matrix[0].length-1]>=target){
       row=d;
       break;}
       }
       return search(matrix[row],  target);

    }
}
