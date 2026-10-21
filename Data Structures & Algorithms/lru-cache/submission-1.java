class LRUCache {
    int capacity = 0;

    HashMap<Integer, Integer> holder;
    LinkedList<String> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.holder = new HashMap<>();
        this.cache = new LinkedList<>();
    }
    
    public int get(int key) {
        if (!holder.containsKey(key)) return -1;

        String s = key + "=" + holder.get(key);

        cache.remove(s);
        cache.addFirst(s);

        return holder.get(key);
    }
    
    public void put(int key, int value) {
        String s = key + "=" + value;

        if (holder.containsKey(key)) {
            String temp = key + "=" + holder.get(key);

            holder.put(key, value);
            cache.remove(temp);

            cache.addFirst(s);
        }else if (holder.size() == capacity) {
            String temp = cache.removeLast();

            int oldKey = Integer.parseInt(temp.substring(0, temp.indexOf("=")));

            holder.remove(oldKey);

            cache.addFirst(s);
            holder.put(key, value);
        }else {
            cache.addFirst(s);
            holder.put(key, value);
        }
    }
}
