class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] res = new int[k];
        Map<Integer,Integer> h = new HashMap();
        Queue<Integer> q = new PriorityQueue((a,b)->h.get(b)-h.get(a));

    for(int num:nums){

        h.put(num, 1+h.getOrDefault(num, 0));



    }

for(int num : h.keySet()){

    q.add(num);
}

for(int i=0;i<k;i++){
res[i]=q.poll();
}

return res;
    }
}
