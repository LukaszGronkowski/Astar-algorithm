import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
	public static String goalState = "123804765";

	public static void main(String[] args) throws IOException {

		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Type the initial board:");
		String initialState = userInput.readLine();
		
		System.out.println("Initital state: " + initialState);
		System.out.println("Goal state: " + goalState);
		
		System.out.println("Choose one of the heuristics: ");
		System.out.println(" 1. Manhattan Distance --- 2. Nielsen");
		int heuristicsChoice = Integer.parseInt(userInput.readLine());
		AStar execute = new AStar(heuristicsChoice);

		// adding the state to the queue with the actual cost to get there and
		// the expected cost to get to the goal state
		execute.addToQueue(initialState, null);
		execute.checkNeighbours();
		//System.out.println(execute.checkedState);
	}
}