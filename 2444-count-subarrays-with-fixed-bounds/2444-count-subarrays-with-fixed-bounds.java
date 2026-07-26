class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {

         long ans = 0;

        int lastmin = -1;
        int lastmax = -1;
        int lastinvalid = -1;


        for (int i =0; i<nums.length;i++){
            if(nums[i] < minK || nums[i] > maxK){
                lastinvalid = i;
            }
            if(nums[i]==minK){
                lastmin = i ;
            }
            if(nums[i]== maxK){
                lastmax=i;
            }
            ans+=Math.max(0,Math.min(lastmin,lastmax)-lastinvalid);


        }
        return ans;
        
    }
}