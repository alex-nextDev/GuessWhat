package nfa03101;



public class GuessWhatTest {
	
	

	public static void main(String[] args) {
	
		GuessWhatMethode.play();
		
		while(GuessWhatMethode.playagain())
		{
			
			GuessWhatMethode.play();
		}

	}
}
