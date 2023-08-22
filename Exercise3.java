package JavaProgram;
import java .util.*;

class Game
{
	private int userNumber;
	private int number;
	int numberOfGuesses = 0;
	
	public void setNumberOfGuesses(int nnumberOfGuesses)
	{
		this.numberOfGuesses = numberOfGuesses;
	}
	public int getNumberOfGuesses()
	{
		return numberOfGuesses;
	}
	Game()
	{
		Random rand = new Random();
		number = rand.nextInt(100);
	}
	public void takeUserInput()
	{
		System.out.print("Enter the number :");
		Scanner sc = new Scanner(System.in);
		userNumber = sc.nextInt();
	}
	boolean isCorrectNumber() {
		numberOfGuesses++;
		if(userNumber==number)
		{
			System.out.println("You Gussed it in "+getNumberOfGuesses()+" attemps.");
			return true;
		}else if(userNumber>number)
		{
			System.out.print("Too High...\n");
		}else if(userNumber<number)
		{
			System.out.print("Too Low...\n");
		}
		return false;
	}
}

public class Exercise3 {

	public static void main(String[]args)
	{
		Game g = new Game();
		do {
			g.takeUserInput();
		}while(!g.isCorrectNumber());
		
		
	}
}

