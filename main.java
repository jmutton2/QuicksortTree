public class main {
    
    public static void main(String[] args) {
        
        LinkedQueue<Integer> LQ = new LinkedQueue<>();
        PointComparator<Integer> PC = new PointComparator<>();
        
        //Add the following points in order: (5,6),(7,10),(50,4),(7,3)
        LQ.enqueue(5,6);
        LQ.enqueue(7,10);
        LQ.enqueue(50,4);
        LQ.enqueue(7,3);    


        
        //Print the list in order
        System.out.println("Unsorted Items: ");
        LQ.print();
        
        //Send the list and an oject of PointComparator class to quicksort
        //Should output: (5,6),(7,3),(7,10),(50,4) 
        System.out.println("Sorted Items: ");
        LQ.quickSort(LQ,PC);
         
        
    }
}
