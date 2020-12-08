public class LinkedQueue<K> implements Queue<K> {
    
    private SinglyLinkedList<K> list = new SinglyLinkedList<>();
    
    public LinkedQueue() {}
    
    @Override
    public int size() {
        
        return list.size;
        
    }
    
    @Override
    public boolean isEmpty() {
        
        return list.isEmpty();
        
    }
    
    @Override
    public void enqueue(K e, K k) {
        
        list.addLast(e,k);
        
    }
    
    @Override
    public void enqueue(Point<K> e) {
        
        list.addLast(e);
        
    }
    
    @Override
    public Point<K> dequeue() {
        
        return list.removeFirst(); 
        
    }
    
    @Override
    public Point<K> first() {
        
        return list.first();
        
    }
    
    public void print() {
        
        list.printAll();
        
    }
    
    boolean printableOne = false;
    boolean printableTwo = false;
    boolean printableThree = false;
    
    public <K> void quickSortRecursive(LinkedQueue<K> S, Comparator<K> comp) {
        
        int n = S.size();
        
        if (n < 2) {
           
            return;
            
        }
        
        Point<K> pivot = S.first();
        
        LinkedQueue<K> L = new LinkedQueue<>();
        LinkedQueue<K> E = new LinkedQueue<>();
        LinkedQueue<K> G = new LinkedQueue<>();
        
        while(!S.isEmpty()) {
            
            Point<K> element = S.dequeue();
            
            int c = comp.compare(element, pivot);
            
            if (c < 0) {
                
                L.enqueue(element);

            }
            else if (c == 0) {
                
                E.enqueue(element);
                
            }
            else {
                
                G.enqueue(element);
                
            }      
        }
        
        quickSortRecursive(L,comp);
        quickSortRecursive(G,comp);
        
        while(!L.isEmpty()) {
            
            S.enqueue(L.dequeue());
            
        }
        
        while(!E.isEmpty()) {
            
            S.enqueue(E.dequeue());
        }
        
        while(!G.isEmpty()) {
            
            S.enqueue(G.dequeue());
            
        }
    }
    
    public void quickSort(LinkedQueue<K> S, Comparator<K> comp) {
        
        quickSortRecursive(S,comp);
        S.print();
        
    }
}
