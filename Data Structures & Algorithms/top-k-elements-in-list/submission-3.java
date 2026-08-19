class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] res = new int[k];
        Map<Integer,Integer> hm = new HashMap<>();

        // frequency map
        for(int n:nums) {
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(hm.get(a), hm.get(b)));

        // 2. Loop through frequency.keySet().

        for(int key : hm.keySet()) {
            pq.add(key);

            if(pq.size() > k) {
                pq.poll();
            }
        }

        for(int i=0;i<k;i++) {
            res[i] = pq.poll();
        }

        return res;


    }
}
