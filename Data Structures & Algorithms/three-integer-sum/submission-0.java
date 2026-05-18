class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++) {
            for(int j=i+1;j<nums.length-1;j++) {
                for(int k=j+1;k<nums.length;k++) {
                        System.out.print(nums[i] + ", " + nums[j] + ", " + nums[k] + "\n");
                        if(nums[i]+nums[j]+nums[k] == 0) {
                            List<Integer> l = new ArrayList<>();
                            l.add(nums[i]);
                            l.add(nums[j]);
                            l.add(nums[k]);
                            Collections.sort(l);
                            if(!checkList(l, ls)) {
                                ls.add(l);
                            }
                        }
                    
                }
            }
        }
        return ls;    
    }

    private boolean checkList(List<Integer> ts, List<List<Integer>> ls) {
        for(List<Integer> l : ls) {
            if(l.equals(ts)) {
                return true;
            }
        }
        return false;
    }
}
