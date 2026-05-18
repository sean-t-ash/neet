class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;
         Map<Integer,Integer> hm = new HashMap<>();
         for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(target - nums[i])) {
                a = hm.get(target - nums[i]);
                b = i;
                break;    
            }
            hm.putIfAbsent(nums[i],i);
         }   
         int[] res = new int[2];
         if(a<b) {
            res[0] = a;
            res[1] = b;
         } else {
            res[0] = b;
            res[1] = a;
         }
         return res;
    }

}
