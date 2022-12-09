import java.util.*;
class inning 
{
	//static void human=0,computer=0;
	public static void playing(String bat,String s2,String bowl)
	{
		if(Main.balls==0)
		{
			System.out.println("--innings Over--");
			if(bat=="human")
			{
				return ;
			}
			else if(bat=="computer")
			{
				return ;
			}
		}
		Scanner scan=new Scanner(System.in);
		screen.clr(s2,bat,bowl);
		System.out.print("     enter your point:");
		int point=scan.nextInt();
		
		if(point>6){
			System.out.print("     enter between 0 to 6 !");
			try{
				Thread.sleep(1000);
			}
			catch(Exception ex){}
			playing(bat,s2,bowl);
		}
		Random rn=new Random();
		int computer_point=rn.nextInt(0,6);
		System.out.println("     ----------------------");
		//screen.clr(s2);
		System.out.println("     Human:"+point+"| computer:"+computer_point);
		System.out.println("     ----------------------");
		if(point==computer_point){
			System.out.println("     ------OUT-------");
			screen.clr(3000);
			if(bat=="human")
			{
				return ;
			}
			else if(bat=="computer")
			{
				return ;
			}
		}
		if(bat=="human")
		{
			Main.human_score+=point;
			
			Main.balls-=1;	
		}
		else if(bat=="computer")
		{
			Main.computer_score+=computer_point;
			Main.balls-=1;
		}
		if(s2=="second" && bat=="human" && Main.human_score>Main.computer_score)
		{
			return ;
		}
		else if(s2=="second" && bat=="computer" && Main.computer_score>Main.human_score)
		{
			return ;
		}
		screen.clr(500);
		playing(bat,s2,bowl);
	}
}