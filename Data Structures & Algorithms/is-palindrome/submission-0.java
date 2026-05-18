class Solution {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        for(int i=0,j=t.length()-1;i<=j;i++,j--) {
            if(t.charAt(i) != t.charAt(j)) {
                return false;
            }
        }
        return true;

    }
}
