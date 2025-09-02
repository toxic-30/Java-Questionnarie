// Showing ways of implementing thread
public class multiThreadingSnippet{
    public static void main(String[]args) {
        MyThread t1 = new MyThread();
        t1.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running in runnable interface");
    }
}
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running in thread class");
    }
}