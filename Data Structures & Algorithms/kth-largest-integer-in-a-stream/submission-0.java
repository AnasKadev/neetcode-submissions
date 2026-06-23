class KthLargest {
    private PriorityQueue<Integer> pq = new PriorityQueue<>(); // min-heap
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        
        for (int n : nums) {
            add(n);
        }
    }

    public int add(int val) {
        if (pq.size() < k) {
            pq.add(val);
        } else if (val > pq.peek()) { // only add if val is bigger than the smallest of top k
            pq.poll();
            pq.add(val);
        }
        
        return pq.peek(); // the Kth largest
    }
}
