class LRUCache {
    Map<Integer,Integer> m ;
    Deque<Integer> d = new ArrayDeque<>();
    int capacity;

    public LRUCache(int capacity) {
        this.m=new HashMap<>(capacity);
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if (m.get(key)==null)
        return -1;
        else {
            if(!m.containsKey(key))
            return -1;
           
                d.remove(key);
                d.addFirst(key);
            return m.get(key);}
         
        
    }
    
    public void put(int key, int value) {
        if (m.containsKey(key)) {
            d.remove(key);
        } else if (m.size() == capacity) {
            int lru = d.removeLast();
            m.remove(lru);
        }

        d.addFirst(key);
        m.put(key, value);
    }
}
