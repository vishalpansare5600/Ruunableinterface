package runnableinterface;

public class MyThread implements Runnable

{

		String msg;
		/*int i;*/
		
		MyThread(String message)
		{
			msg=message;
		}

		@Override
		public void run() 
		{
			for(int count=0; count<=5; count++)
			{
				try
				{
					System.out.println("Run method"+msg);
					
					Thread.sleep(100);
					/*System.out.println(i);*/
					
				}catch(Exception e)
				{
				System.out.println(e.getMessage());	
				}
			}
			
		}
}
