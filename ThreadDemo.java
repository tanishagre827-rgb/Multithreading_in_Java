class MyThread1 extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
            {
            System.out.println("Thread 1 running: " + i);
            try 
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

class MyThread2 extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
            {
            System.out.println("Thread 2 running: " + i);
            try 
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo 
{
    public static void main(String[] args) 
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();  // starts thread 1
        t2.start();  // starts thread 2
    }
}
