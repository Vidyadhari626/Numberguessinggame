package game;

import java.util.*;

public class task {

	public static void main(String[] args) {
		Random r=new Random();
		int r1=r.nextInt(100);
		int score=100,chance=10;
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<chance;i++)
		{
			System.out.println("Enter your number");
			int num=sc.nextInt();
			if(r1==num)
			{
				System.out.println("Yeah! Your number is Matched with Generated Number");
				System.out.print("Your guessing score is "+score+"%");
				break;
			}
			else if(num<r1)
			{
				score=score-10;
				System.out.println("Your number is less than Generated Number! TRY AGAIN");
			}
			else if(num>r1)
			{
				score=score-10;
				System.out.println("Your number is More than Generated Number! TRY AGAIN");
			}
		}
	}
}

				
			
