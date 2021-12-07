class MyThread extends Thread{
    public void run(){
        int i =0;
        while(i<100){
            System.out.println("Thread 111111111");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i =0;
        while(i<100){
            System.out.println("Thread 2222222");
            i++;
        }
    }
}

public class Threadss {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        // t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try {
            Thread.sleep(120);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            extracted(e);
        }
        t2.start();
    }

    private static void extracted(InterruptedException e) {
        e.printStackTrace();
    }
}
