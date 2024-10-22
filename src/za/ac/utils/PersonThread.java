
package za.ac.utils;

import za.ac.util.Person;


public class PersonThread implements Runnable {
    private Person p;

    public PersonThread(Person p) {
        this.p = p;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+" is starting");
        
        for(int i=0;i<5;i++){
            p.incrementAge();
            System.out.println(Thread.currentThread().getName()+": "+p.getAge());
        }
        System.out.println(Thread.currentThread().getName()+" is stopping");

    }
    
    
    
}
