class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]= new int [nums.length*2];
       // ArrayList<Integer>ans = new ArrayList<>();

        for(int i = 0 ; i<nums.length;i++){
            ans[i] = nums[i];
         
        }
        for(int i = 0 ; i<nums.length;i++){
            ans[nums.length+i] = nums[i];
         
        }
        
        return ans ;
    }
}