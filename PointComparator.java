public class PointComparator<K> implements Comparator<K> {

    K xa, ya, xb, yb;
    
    
    //Lexicographically compares two points.
    @Override
    public int compare(Point<K> a, Point<K> b) throws ClassCastException {
        
        xa = (K)((Point<K>) a).getX();
        ya = (K)((Point<K>) a).getY();
        xb = (K)((Point<K>) b).getX();
        yb = (K)((Point<K>) b ).getY();
        
        if (xa != xb) {
            
            return ((int)xa - (int)xb);
            
        }
        else {
            
            return ((int)ya - (int)yb);
            
        }
    }
}
