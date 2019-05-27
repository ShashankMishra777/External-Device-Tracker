import java.io.*;

class ProjectFunctions
{
	//to fetch number of drives present in one's PC
	static void number()
	{
		File [] roots =File.listRoots();
		System.out.println("Total No. of Drives :"+ roots.length);
		System.out.println("***********************");
	}
	
	//to fetch names of drives present in one's PC
	static void name()
	{
		System.out.println("Names of the drives are as follows ->");
		File [] roots =File.listRoots();
		for(File d:roots)
		{
			System.out.println(d.toString());
		}
		System.out.println("*************************************");
	}
	
	//to fetch space in all the drives present in one's PC
	static void space()
	{
		File [] roots =File.listRoots();
		for(File d:roots)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
			System.out.println(d.toString());
			System.out.println("Total Space      :"+ d.getTotalSpace()/(1024.0f*1024.0f*1024.0f)+"GB");
			System.out.println("Total Free Space :"+ d.getFreeSpace()/(1024.0f*1024.0f*1024.0f)+"GB");
			System.out.println("Total Used Space :"+ d.getUsableSpace()/(1024.0f*1024.0f*1024.0f)+"GB");
			System.out.println("------------------------------");
		}
		System.out.println("*************************************");
	}
	
	//to check status of USB
	static void usb()
	{
		File [] roots=File.listRoots();
		int tnd = roots.length;
		System.out.println("Scanning USB Drives :");
		while(true)
		{
			roots= File.listRoots();
			int utnd= roots.length;
			if(utnd>tnd)
			{
				System.out.println("USB Plugged-In");
				tnd=utnd;
				
				space();
			}
			if(utnd<tnd)
			{	System.out.println("USB Un-Plugged");
				tnd=utnd;
			}
		}
	}
}