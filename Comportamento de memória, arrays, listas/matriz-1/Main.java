import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal:");

		for (int i = 0; i < matrix.length; i++) {
			System.out.printf(matrix[i][i] + " ");
		}

		System.out.println();
		int negatives = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					negatives++;
				}
			}
		}

		System.out.printf("Negative numbers = %d", negatives);

	}
}