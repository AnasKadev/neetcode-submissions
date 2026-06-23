class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for(int s:stones){
            q.add(s);
        }
        while(q.size()>1){
            int x= q.poll();
            int y=q.peek();
            if(x==y)
            q.poll();
            else{
                q.poll();
                q.add(x-y);


            }

        }
        if(q.size()==0)
        return 0;
        else
        return q.peek();
        
    }
}
