import java.util.*;


public class MultiThreading extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500);

            } catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        MultiThreading thread1 = new MultiThreading();
        MultiThreading thread2 = new MultiThreading();
        thread1.start();
        thread2.start();
    }

}
