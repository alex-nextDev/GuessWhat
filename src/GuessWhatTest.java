package nfa031;

public class GuessWhatTest{

	public static void main(String[] args) {
		
		GuessWhat.play();
		
		while(GuessWhat.playagain())
		{
			GuessWhat.play();
		}
	}
}
