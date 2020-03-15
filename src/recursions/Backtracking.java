package recursions;

public class Backtracking {

	static int count;

	public static void main(String[] args) {
		// queenPermutatiion(new boolean[6], 0, 3, "");
		// queenCombination(new boolean[4], 0, 2, "", -1);
		// coinChange(new int[] {2,3,5,6}, 10,"", 0);
		// queenCombinationBoxRespect(new boolean[4], 0, 0, 2, "");
		// System.out.println(nQueens(new boolean[4][4], 0, ""));
		// int[][] bhoolbhulaiya = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, {
		// 0, 0, 1, 0 } };
		// blockedMaze(bhoolbhulaiya, 0, 0, "", new
		// boolean[bhoolbhulaiya.length][bhoolbhulaiya[0].length]);
		char[][] arr = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "SEE";
		boolean ans = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==word.charAt(0))
				ans = ans || searchWord(arr, i, j, word, 0, new boolean[arr.length][arr[i].length]);
			}
		}
		System.out.println(ans);

	}

	public static void queenPermutatiion(boolean[] board, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.println(++count + ". " + ans);
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;

				queenPermutatiion(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
				board[i] = false; // undo
			}
		}
	}

	public static void queenCombination(boolean[] board, int qpsf, int tq, String ans, int lastboxused) {
		if (qpsf == tq) {
			System.out.println(++count + ". " + ans);
			return;
		}
		for (int i = lastboxused + 1; i < board.length; i++) {

			if (board[i] == false) {
				board[i] = true;
				queenCombination(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ", i);
				board[i] = false; // undo
			}

		}
	}

	public static void coinChange(int[] denom, int amount, String ans, int lastCoinUsedIdx) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		if (amount < 0) {
			return;
		}

		for (int i = lastCoinUsedIdx; i < denom.length; i++) {
			coinChange(denom, amount - denom[i], ans + denom[i], i);
		}

	}

	public static void queenCombinationBoxRespect(boolean[] board, int col, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board.length) {
			return;
		}

		// yes
		board[col] = true;
		queenCombinationBoxRespect(board, col + 1, qpsf + 1, tq, ans + "b" + col);
		board[col] = false;

		// no
		queenCombinationBoxRespect(board, col + 1, qpsf, tq, ans);

	}

	private static boolean isItSafe(boolean[][] board, int row, int col) { // current position of queen is safe or not
		// vertically up
		for (int i = row - 1; i >= 0; i--) {
			if (board[i][col])
				return false;
		}

		// diagonally left
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j])
				return false;
		}

		// diagonally right
		for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j])
				return false;
		}

		// safe case
		return true;

	}

	public static int nQueens(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.println(ans);
			return 1;
		}

		int c = 0;

		for (int col = 0; col < board.length; col++) {
			if (isItSafe(board, row, col)) {

				board[row][col] = true; // place it
				c = c + nQueens(board, row + 1, ans + "(" + row + "," + col + ")" + "; ");
				board[row][col] = false; // remove it
			}
		}
		return c;

	}

	public static void blockedMaze(int[][] maze, int row, int col, String ans, boolean[][] visited) {
		// positive base case
		if (row == maze.length - 1 && col == maze[row].length - 1) {
			System.out.println(ans);
			return;
		}

		// negative base case
		if (row < 0 || row >= maze.length || col < 0 || col >= maze[row].length || maze[row][col] == 1
				|| visited[row][col]) {
			return;
		}

		visited[row][col] = true; // do
		// Bottom
		blockedMaze(maze, row + 1, col, ans + "B", visited);
		// Top
		blockedMaze(maze, row - 1, col, ans + "T", visited);
		// Right
		blockedMaze(maze, row, col + 1, ans + "R", visited);
		// Left
		blockedMaze(maze, row, col - 1, ans + "L", visited);
		visited[row][col] = false; // undo

	}

	public static boolean searchWord(char[][] arr, int row, int col, String word, int idx, boolean[][] visited) {
		if (idx == word.length())
			return true;

		if (row < 0 || row >= arr.length || col < 0 || col >= arr[row].length || visited[row][col]
				|| arr[row][col] != word.charAt(idx)) {
			return false;
		}

		visited[row][col] = true;
		// T
		boolean t = searchWord(arr, row - 1, col, word, idx + 1, visited);
		// L
		boolean l = searchWord(arr, row, col - 1, word, idx + 1, visited);
		// R
		boolean r = searchWord(arr, row, col + 1, word, idx + 1, visited);
		// B
		boolean b = searchWord(arr, row + 1, col, word, idx + 1, visited);
		visited[row][col] = false;

		return t || l || r || b;

	}

}
