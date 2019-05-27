class MyThread1 implements Runnable
{
	public void run()
	{
		DeviceTracker ob1=new DeviceTracker();
		ob1.usb();
	}
}