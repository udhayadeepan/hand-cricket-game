import java.io.*;
public class screen
{
	public static void clr(String innings,String bat,String bowl)
	{

		try 
		{
			if(System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			//else 
				//Runtime.getRunTime().exec("clear");
			
		}catch(IOException | InterruptedException ex){}
		System.out.println("     ---------HAND CRICKET-----------");
		System.out.println("     "+innings+" innings   "+"  Balls Left:"+Main.balls);
		System.out.println("     ________________________________");
		System.out.println();
		
		System.out.println("                   SCORE BOARD      ");
		System.out.println("      ________________________________");
		 System.out.printf("     |HUMAN(YOU):%4d  | COMPUTER:%4d|\n",Main.human_score,Main.computer_score);
		System.out.println("     |________________________________|");
		System.out.println("\n");
		System.out.println("     --------------------------------");
		System.out.println("     Batsman:"+bat+"  Bowler:"+bowl);
		System.out.println("     --------------------------------");

		
		
		
	}
	public static void clr(int n)
	
	{
		
		try 
		{
			Thread.sleep(n);
			if(System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			//else 
				//Runtime.getRunTime().exec("clear");
			
		}catch(IOException | InterruptedException ex){}
	}
}