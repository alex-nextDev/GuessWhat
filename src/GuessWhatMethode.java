package nfa031;

import java.util.Scanner;

public class GuessWhatMethode {

	
	public static Scanner lecteur = new Scanner(System.in);
	
	public static void play()
	{
		String joueur = userChoice();
		String computer = computerChoice();
		match(joueur, computer);
	}
	
	public static boolean playagain()
	{
		
		System.out.println("Rejouer ? o/n");
		String gamer = lecteur.nextLine();
		
		if(gamer.toLowerCase().equals("o"))
		{
			System.out.println("OK, devine encore");
			play();
			return true;
		}
		else if(gamer.toLowerCase().equals("n"))
		{
			System.out.println("Ok, à bientôt :) ");
			return false;
		}
		else
		{
			System.out.println("Commande invalide");
			playagain();
			return false;
		}
		
	}
	 
	
	public static String userChoice()
	{
		System.out.println("Devinez un nombre entre 1 et 10 auquel l'ordinateur pense : ");
		String gamer = lecteur.nextLine();

		if(gamer.equals("1") || gamer.equals("2") || gamer.equals("3") || gamer.equals("4")
				|| gamer.equals("5") || gamer.equals("6") || gamer.equals("7")
				|| gamer.equals("8") || gamer.equals("9") || gamer.equals("10"))
		{
			System.out.println("Vous avez choisi : " + gamer);
		}
		
		else
		{
			System.out.println("Bien essayé ! mais cette exception est prévue ^^, recommence : ");
			play();
		}
		return gamer;

	}
	
	
	public static String computerChoice()
	{
		
		int val = (int) (Math.random() * 10);
		String c = "";
		String c0 = "1";
		String c1 = "2";
		String c2 = "3";
		String c3 = "4";
		String c4 = "5";
		String c5 = "6";
		String c6 = "7";
		String c7 = "8";
		String c8 = "9";
		String c9 = "10";

		if(val == 1)
		{
			c = c0;
		}
		else if(val == 2)
		{
			c = c1;
		}
		else if(val == 3)
		{
			c = c2;		
		}
		else if(val == 4)
		{
			c = c3;
		}
		else if(val == 5)
		{
			c = c4;
		}
		else if(val == 6)
		{
			c = c5;
		}
		else if(val == 7)
		{
			c = c6;
		}
		else if(val == 8)
		{
			c = c7;
		}
		else if(val == 9)
		{
			c = c8;
		}
		else if(val == 10)
		{
			c = c9;
		}
		return c;
	}
	
	public static void match(String joueur, String computer)
	{
		if(joueur.equals(computer))
		{
			System.out.println("Bravo ! Vous avez deviné le nombre -> " + computer + " <- que l'ordinateur avait en tête");;
			playagain();
		}
		else
		{
			System.out.println("Perdu, dommage");
			playagain();
		}
	}
	
}
