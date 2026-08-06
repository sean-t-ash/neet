class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prod = 1;
        int prodZero = 0;
        int zeroCount = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                zeroCount ++;
            } else {
                prod *= nums[i];
            }
        } 

        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                if(zeroCount > 1)
                    res[i] = 0;
                else
                    res[i] = prod;    
            } else {
                if(zeroCount > 0)
                    res[i] = 0;
                else    
                    res[i] = prod / nums[i];
            }
        }   

        return res;
    }
    

    
}  
