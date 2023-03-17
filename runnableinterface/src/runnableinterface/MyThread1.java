package runnableinterface;

public class MyThread1 {

	public static void main(String[] args) 
	{
		
		MyThread MT1=new MyThread("Mythread 1");
		MyThread MT2=new MyThread("Mythread 2");
		MyThread MT3=new MyThread("Mythread 2");
		
		Thread T1=new Thread(MT1);
		Thread T2=new Thread(MT2);
		Thread T4=new Thread(MT3);
		T1.start();
		
		try
		{
			
		System.out.println("Implementing join "+Thread.currentThread().getName());
		T1.join();
		
	}catch(Exception e)
	{
		System.out.println("exception ");
	}
	T4.start();
		
		
		
		T2.start();
		
	
		
		/*Runnable r=new MyThread("thread 3");
		Thread t3=new Thread (r);
		t3.start();*/

}
}
