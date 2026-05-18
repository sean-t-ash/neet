class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] newArr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(newArr);
        int left=0;
        int right=(newArr.length)-1;

        int num1=0;
        int num2=0;
        int ind1=-1;
        int ind2=-1;

        while(left<right) {
            int sum = newArr[left]+newArr[right];
            if(sum == target) {
                num1 = newArr[left];
                num2 = newArr[right];
                break;
            } else if(sum < target) {
                left++;
            } else {
                right --;
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == num1 && ind1 == -1)
                ind1 = i;
            else if(nums[i] == num2)
                ind2 = i;    
        }
        int[] res = {ind1, ind2};
        Arrays.sort(res);
        return  res;

    }
}
