class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for(String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String tempStr = new String(temp);
            if(!hm.containsKey(tempStr)) {
                List<String> ls = new ArrayList<>();
                ls.add(str);
                hm.put(tempStr, ls);
            } else { 
               hm.get(tempStr).add(str); 
            }
        }
        System.out.println(hm.entrySet());
        List<List<String>> res = new ArrayList<>();
        for(List<String> l : hm.values()) {
            res.add(l);
        }
        
        return res;

    }
}
