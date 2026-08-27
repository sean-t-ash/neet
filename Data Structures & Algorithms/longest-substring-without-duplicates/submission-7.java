class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxlen = 0;
        Set<Character> hs = new HashSet<>();

        for(int right=0;right<s.length();right++) {

            char ch = s.charAt(right);

            while(hs.contains(ch)) {
                hs.remove(s.charAt(left));
                left++;
            }

            hs.add(ch);
            maxlen = Math.max(maxlen,hs.size());

        }

        return maxlen;


    }
}
