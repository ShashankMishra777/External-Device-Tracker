import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.*;

class DeviceTracker extends ProjectMenu
{
	public static void main(String [] args)throws Exception
	{
		System.out.println(" ____  _  _  ____  ____  ____  _  _    __    __        ____   ____  _  _  ____   ___  ____     ____  ____    __    ___  _  _  ____  ____ ");
		System.out.println("( ___)( \\/ )(_  _)( ___)(  _ \\( \\( )  /__\\  (  )      (  _ \\ ( ___)( \\/ )(_  _) / __)( ___)   (_  _)(  _ \\  /__\\  / __)( )/ )( ___)(  _ \\");
		System.out.println(" )__)  )  (   )(   )__)  )   / )  (  /(__)\\  )(__      )(_) ) )__)  \\  /  _)(_ ( (__  )__)      )(   )   / /(__)\\( (__  )  (  )__)  )   /");
		System.out.println("(____)(_/\\_) (__) (____)(_)\\_)(_)\\_)(__)(__)(____)    (____/ (____)  \\/  (____) \\___)(____)    (__) (_)\\_)(__)(__)\\___)(_)\\_)(____)(_)\\_)");
		System.out.println();
		
		showMessageDialog(null,"WELCOME :) PRESS OK TO CONTINUE. ");
		
		MyThread1 mt1 = new MyThread1();
		Thread t1 = new Thread(mt1);
		
		MyThread2 mt2 = new MyThread2();
		Thread t2 = new Thread(mt2);
		
		t1.setName("USB");
		t2.setName("MENU");
		
		t1.setPriority(10);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
	
	}
}
