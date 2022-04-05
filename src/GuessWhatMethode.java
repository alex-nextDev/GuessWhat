package nfa03101;

import java.util.Scanner;

public class GuessWhatMethode {

	
	public static void play()
	{
		System.out.println("Saisi un chiffre entre 1 et 10 : ");
		gameplay();
		
	}
	
	public static void gameplay()
	{
		Scanner scanner = new Scanner(System.in);
		
		
		int computer = (int) (Math.random() * 10 + 1);
		int count = 0;
		int gamer = 0;
		
		while(gamer != computer)
		{
			try {
				int number = 0;
				gamer = scanner.nextInt();
				count++;
				number = Integer.parseInt(scanner.next());
        
				if(gamer < computer)
				{
					System.out.println("vous trop petit." + " Tu en es a " + count + " essais, essaie encore :");
				}
				else if(gamer > computer)
				{
					System.out.println("vous êtes trop grand." + " Tu en es a " + count + " essais,  essaie encore :");
				}
				
			
				}catch(NumberFormatException e) {
					System.out.println("Erreur, entrez un chiffre");
			}
		}
		System.out.println("Yes, le bon chiffre est bien : " + computer + " Tu en es a " + count + " essais");
		}

	public static boolean playagain()
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Voulez-vous rejouer ? o/n");
		String choix = scanner.nextLine();
		char lettre = choix.toLowerCase().charAt(0);
    
		if (lettre != 'o' && lettre != 'n')
		{
		  System.out.println("Entrée invalide");
		  return playagain();
		}
		if (lettre == 'o')
		{
		  System.out.println("Super :)");
		  return true;
		}
		System.out.println("Bye, à bientôt :) ");
		return false;
		
	}
	
	
}
