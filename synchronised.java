import java.io.*;
class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Welcome ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("I got interrupted ");
			}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d, String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);

	}
}

class sync
{
	public static void main(String args[])
	{
		Display d = new Display();
		//Display d1 = new Display();
		MyThread t1 = new MyThread(d,"ABC");
		MyThread t2 = new MyThrad(d,"XYZ");
		//MyThread t2 = new MyThread(d1,"XYZ");
		t1.start();
		t2.start();
	}
}

		 	       
