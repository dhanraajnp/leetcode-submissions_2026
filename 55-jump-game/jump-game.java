class Solution {
    public boolean canJump(int[] nums) {
        
        int len = nums.length;
        int maxJump = 0;
        
        for(int i=0 ;i<len; i++){

            if(maxJump >= len-1){
                return true;
            }

            maxJump = Math.max(maxJump, i+nums[i]);

            if(maxJump == 0 || (maxJump == i && nums[i] == 0) )
                return false;
        }
        
        return false; 

    }
}