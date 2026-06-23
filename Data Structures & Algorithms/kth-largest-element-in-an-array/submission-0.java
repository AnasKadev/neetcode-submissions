class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p= new PriorityQueue<>((a,b)-> b - a);
        for(int n:nums){
            p.add(n);
           
        }
        for(int i=0;i<k-1;i++){
            p.poll();
        }
        return p.peek();
         
    }
}
