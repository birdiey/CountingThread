
package countingthread;

import za.ac.util.Person;
import za.ac.utils.PersonThread;


public class CountingThread {

   
    public static void main(String[] args) {
       Person p =new Person();
       
        PersonThread pt= new PersonThread(p);
        
        
        Thread t = new Thread(pt);
        Thread t2 = new Thread(pt);
        
        t.setName("Samu");
        t2.setName("Samkelo");
        t.start();
        t2.start();
        
        
    }
    
}
