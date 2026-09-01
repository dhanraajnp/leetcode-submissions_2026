class Solution {
    public int minimumDeletions(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int i = -1;
        int j = -1;
        int n = nums.length;
        for(int t = 0;t<n;t++){
            if(maxi<nums[t]){
                maxi = nums[t];
                i = t;
            }
            if(mini>nums[t]){
                mini = nums[t];
                j = t;
            }
        }

        return Math.min(Math.max(i+1,j+1),Math.min(Math.min(i+1,n-i)+Math.min(j+1,n-j),n-Math.min(i,j)));
    }
}