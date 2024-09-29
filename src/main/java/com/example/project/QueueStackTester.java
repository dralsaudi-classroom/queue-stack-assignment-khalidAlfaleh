package com.example.project;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
       int x = q.length();
        int i = 1;
        //int z = 0;
        //if(x % 2 == 0){
          //  x = x+1;
            //z = 1;
       /// }
        //else 
          //  z = 0;

        
        re(q, oq, eq, x, i);
    }
         public static <T> void re(Queue<T> q, Queue<T> oq, Queue<T> eq, int x, int i){
             if(  i == x +1 )
                 return; 
             
         T temp = q.serve();
       if(x % 2 != 0)
           oq.enqueue(temp);
         else
           eq.enqueue(temp);
        
                 q.enqueue(temp);
             i++;
    re(q, oq, eq, x, i);

               
         


        
             //if(i % 2 != 0){
           //  T temp = q.serve();
             //oq.enqueue(temp);
             //q.enqueue(temp);
         //}

        
        //int x = q.length();
        //for(int i =1; i<=x; i++){
         //if(i % 2 != 0){
           //  T temp = q.serve();
             //oq.enqueue(temp);
             //q.enqueue(temp);
         //}
           // else{
             //    T temp2 = q.serve();
             //eq.enqueue(temp2);
             //q.enqueue(temp2);
            //}
             

            
        
        //throw new UnsupportedOperationException("Not supported yet.");
        // Write the recursive static method split that splits a queue of n elements into two
        // queues. The elements with odd orders (i.e. 1st, 3rd, 5th ...) should be put in the
        // first queue and elements with even orders (i.e. 2nd, 4th, 6th ...) should be put in
        // the second queue. The original queue should remain unchanged at the end of the
        // method.
        // Example. Given the queue (A, B, C, D, E), split results in oq (A, C, E), and eq(B, D).
    }
    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
        

        
        //throw new UnsupportedOperationException("Not supported yet.");
        // Write a static method remove that removes every element in the priority queue
        // having priority less than p.
        // Example. Given pq: [A, 10], [D, 8], [B, 5], [E, 3], [C, 2] remove(pq, 5) results in
        // pq: [A, 10], [D, 8], [B, 5].
    }
    public static <T> boolean search(Stack<T> st, T e)
    {
        throw new UnsupportedOperationException("Not supported yet.");
        // Write the recursive static method search that searches for an element e in a stack st
        // and returns true if it’s found or false otherwise. st should not change at the end of
        // the method. You are not allowed to use any auxiliary data structures.
        // Example. Given the stack st (top-to-bottom): 5, 7, 5, 3, 2. search(st, 3) returns
        // true while search(st, 1) returns false.
    }
}
