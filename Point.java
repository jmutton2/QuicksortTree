public class Point<K> {
    
    K x;
    K y;
    
    //2D point adder
    public void Point(K x, K y) {
        
        this.x = x;
        this.y = y;
        
    }
    
    //Setters
    public void setX(K x) {
        
        this.x = x;
        
    }
    
    public void setY(K y) {
        
        this.y = y;
        
    }
    
    //Getters 
    public K getX() {
        
        return x;
        
    }
    
    public K getY() {
        
        return y;
        
    }    
}
