import java.util.*;
class Main 
{
	static int human_score=0;
	static int computer_score=0;
	static int balls=0;
	public static void main(String[] args) {
		System.out.println("     ----HAND CRICKET GAME----");
		Scanner scan=new Scanner(System.in);
		System.out.println("     1.Start\n     2.Quit");
		System.out.print("     enter your choice:");
		int op=scan.nextInt();
		int over=0;
		int toss_winner=0;
		if(op==1) {
			System.out.println("     --------------------------");
			System.out.print("     Enter Number Of overs:");
			over=scan.nextInt();
			toss_winner=toss.toss_make();
		}
		else 
		{
			return;
		}

		if(toss_winner==1)
		{
			balls=over*6;
			inning.playing("human","first","computer");
			System.out.println("     ------FIRST INNING RESULTS------");
			score(human_score,computer_score);
			balls=over*6;
			inning.playing("computer","second","human");
			System.out.println("     ------SECOND INNING RESULTS------");
			score(human_score,computer_score);
		}
		else 
		{
			balls=over*6;
			inning.playing("computer","first","human");
			System.out.println("     ------FIRST INNING RESULTS------");
			score(human_score,computer_score);
			balls=over*6;
			inning.playing("human","second","computer");
			System.out.println("     ------SECOND INNINGS RESULTS-----");
			score(human_score,computer_score);
		}
		if(human_score>computer_score)
		{
			System.out.println("     -----YOU WON THE MATCH-------");
		}
		else if(human_score==computer_score)
		{
			System.out.println("     -------Match Draw---------");
		}
		else 
		{
			System.out.println("     ------SORRY YOU LOST----------");
		}

	}
	static void score(int human_score,int computer_score)
	{
			System.out.println("     |------Score Card------|");
			System.out.println("     | Human:"+human_score);
			System.out.println("     | computer:"+computer_score);
			System.out.println("     |----------------------|");
			screen.clr(5000);

	}
}