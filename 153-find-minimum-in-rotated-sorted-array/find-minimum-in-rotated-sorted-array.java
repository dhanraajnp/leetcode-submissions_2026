class Solution {
    public int findMin(int[] nums) {
        return nums[findPivot(nums)+1];
    }
    
    private int findPivot(int[] nums){
        
        int len = nums.length;
        int low=0;
        int high = len-1;
        int mid =0;
        
        while(low < high){
            
            mid = (low+high)/2;
            
            if(mid < len-1 && nums[mid] > nums[mid+1]){
                return mid;
            } else if(mid >0 && nums[mid-1] > nums[mid] ){
                return mid-1;
            }
            
            if(nums[low] < nums[mid] ){
                low = mid+1; 
            } else if(nums[high] > nums[mid]){
                high = mid-1;
            }            
        }
        return -1;
    }
}