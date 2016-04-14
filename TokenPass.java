import java.util.*;

public class TokenPass{
	private int[] board;
	private int currentPlayer;

	public TokenPass(int playerCount){
		Random rand = new Random();
		board = new int[playerCount];
		for (int tokens : board){
			tokens = rand.nextInt(10) + 1;
		}
		currentPlayer = rand.nextInt(playerCount);
	}

	public void distributeCurrentPlayerTokens(){
		int tokens = board[currentPlayer];
		for(int i = currentPlayer + 1; tokens != 0; i++){
			if(i == board.length){
				i = 0;
			}
			board[i]++;
			tokens--;
		}
	}
}