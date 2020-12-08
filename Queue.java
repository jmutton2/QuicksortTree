public interface Queue<K> {
    
    int CAPACITY = 10;
    
    int size();
    
    boolean isEmpty();
    void enqueue(K k, K j);
    void enqueue(Point<K> k);
    Point<K> dequeue();
    Point first();
    
}
