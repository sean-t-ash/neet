class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t==null) return false;
        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++ ) {
            if(!hm1.containsKey(s.charAt(i))) {
                hm1.put(s.charAt(i), 1);
            }
            else{
                hm1.put(s.charAt(i), hm1.get(s.charAt(i))+1);
            }
            if(!hm2.containsKey(t.charAt(i))) {
                hm2.put(t.charAt(i), 1);
            }
            else{
                hm2.put(t.charAt(i), hm2.get(t.charAt(i))+1);
            }
        }
        
        for(char c: hm1.keySet()) {
            if(!hm2.containsKey(c)) return false;
            if(!hm1.get(c).equals(hm2.get(c))) return false;
            
        }
        
        for(char c: hm2.keySet()) {
            if(!hm1.containsKey(c)) return false;
            if(!hm2.get(c).equals(hm1.get(c))) return false;
        }

        return true;
    }
}
