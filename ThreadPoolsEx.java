import java.util.concurrent.*;

public class ThreadPoolsEx 
  {
    public static void main (String args[]) 
    {
      ExecutorService pool = Executors.newFixedThreadPool(5); throws InterruptedException
      for (int i = 1; i<=5; i++)
        {
          int id=i;
          pool.execute(() -> System.out.println("Task "+id+" on "+Thread.currentThread().getName()));
		  Thread.sleep(200);
        }
      pool.shutdown();
      pool.awaitTermination(1,TimeUnit.SECONDS);
        }
  }