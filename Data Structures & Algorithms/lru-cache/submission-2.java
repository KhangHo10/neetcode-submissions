class LRUCache {

    class Node {
        int key;
        int val;

        Node next;
        Node prev;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;

            next = null;
            prev = null;
        }
    }

    Node head;
    Node tail;

    HashMap<Integer, Node> holder;
    int capacity = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.holder = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        tail.prev = head;
        head.next = tail;
    }

    public void add(Node n) {
        n.next = head.next;
        head.next.prev = n;

        head.next = n;
        n.prev = head;
    }

    public void remove(Node n) {
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }
    
    public int get(int key) {
        if (!holder.containsKey(key)) return -1;

        remove(holder.get(key));
        add(holder.get(key));

        return holder.get(key).val;
    }
    
    public void put(int key, int value) {
        Node n = new Node(key, value);
        
        if (holder.containsKey(key)) {
            holder.get(key).val = value;

            remove(holder.get(key));
            add(holder.get(key));
        }else if (holder.size() == capacity) {
            Node last = tail.prev;

            remove(last);
            holder.remove(last.key);

            holder.put(key, n);
            add(n);
        }else {
            holder.put(key, n);
            add(n);
        }
    }
}
