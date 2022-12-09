import java.util.*;
class toss{
	public static int toss_make()
	{
		screen.clr(0);
		Scanner scan=new Scanner(System.in);
		System.out.println("     -----------TOSS---------------");
		System.out.print("     enter H for head and T for Tail:");
		char ch=scan.next().charAt(0);
		if(ch>95)ch-=32;
		char options[]={'H','T'};
		Random rn=new Random();
		char result=options[(rn.nextInt(0,2))];
		if(result==ch)
		{
			System.out.println("     ---You Won The Toss---");
			screen.clr(2000);
			return 1;

		}
		else {
			System.out.println("     ---Computer won the Toss---");
			screen.clr(2000);
			return 2;
		}
	}
}