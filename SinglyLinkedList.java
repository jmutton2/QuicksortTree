public class SinglyLinkedList<K> extends Point<K> {
    
    //
    private static class Node<K> {
        //These 'ere are du too parts to each node
        private Point<K> element;
        private Node<K> next;
        
        public Node(Point<K> element, Node<K> next) {
            this.element = element;
            this.next = next;
        }
        //A method to obtain the elements within the nodes
        public Point<K> getElement() {
            return element;
        }
        public Node<K> getNext() {
            return next;
        }
        //A way to set the elements within the node
        public void setNext(Node<K> next) {
            this.next = next;
        }
    }
    
    
    private Node<K> head; //Automatically assigned to null on start.
    private Node<K> tail; //""
    
    int size = 0;
    public SinglyLinkedList() {    
        
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean isEmpty() {
        return (size==0);
    }
    
    public Point<K> last() {
        if (isEmpty()) {
            return null;
        } else {
            return tail.getElement();
        }
    }
    public Point<K> first() {
        if (isEmpty()) {
            return null;
        } else {
            return head.getElement();
        }
    }
    
    public void addFirst(Point<K> e) {
        Node<K> newNode = new Node<>(e,head);
        
        head = newNode;
        if (isEmpty())
            tail = newNode; 
        size++;
    }
    
    public void addLast(K elOne, K elTwo) {
        
        Point<K> p = new Point<>();
        
        p.setX(elOne);
        p.setY(elTwo);
                
        Node<K> newNode = new Node<>(p,null);
        
        if (size == 0)
            head = newNode;
        else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }
    
    public void addLast(Point<K> k) {
      
        Node<K> newNode = new Node<>(k,null);
        
        if (size == 0)
            head = newNode;
        else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }
    
    public Point<K> removeFirst() {
        if (isEmpty())
            return null;
        Point<K> firstElement = head.getElement();
        
        head = head.getNext();
        size--;
        if (isEmpty())
            tail = null;
        return firstElement;
    }
    
    public void printAll() {
        Node<K> currentNode = head;
        
        while(currentNode != null) {
            
            System.out.println("(" + currentNode.getElement().getX() + "," + currentNode.getElement().getY() + ")");
            
            currentNode = currentNode.getNext();
        
        }
        
    }
}
