import java.io.*;
import static javax.swing.JOptionPane.*;
import java.util.*;

class ProjectMenu extends ProjectFunctions
{
	static void menu1()
	{
		String menu= "USER MENU \n ----------------------- \n PRESS 1 FOR : Total number of Drives \n PRESS 2 FOR : Names of Drives \n PRESS 3 FOR : Total Space in Drives \n PRESS 4 FOR : EXIT";
		try 
		{
			int ch = Integer.parseInt(showInputDialog(menu)); 
			
			if (ch == 1)
			{
				number();
				yesorno();
			}
			else if (ch == 2)
			{
				name();
				yesorno();
			}
			else if (ch == 3)
			{
				space();
				yesorno();
			}
			else if (ch == 4)
				System.out.println("BYE-BYE ! YOU'RE OUT OF THE MAIN MENU. ");
			else 
			{
				showMessageDialog(null,"OOPS WRONG ENTRY ! Make your choice again. ");
				menu1();
			}
		}
		catch(Exception e)
		{
			showMessageDialog(null,"OOPS WRONG ENTRY ! Make your choice again. ");
			menu1();
		}
	}

	static void yesorno()
	{
		Console c = System.console();
		String menu="Do you want to continue?\nEnter 1 for YES\nEnter 2 for NO";
		
		try
		{
			int choice1=Integer.parseInt(showInputDialog(menu));
			if (choice1 == 1)
				menu1();
			else if(choice1 == 2)
				System.out.println("BYE-BYE");
			else
			{
				showMessageDialog(null,"OOPS WRONG ENTRY !1 Make your choice again. ");
				yesorno();
			}
		}
		catch(Exception e)
		{
			showMessageDialog(null,"OOPS WRONG ENTRY !2 Make your choice again. ");
			yesorno();
		}
	}
}