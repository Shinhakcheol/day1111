package Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		int m = 4;
		int n = 4;
		int[][] arr = new int[m][n];
		int count = 1;
		/////////////////////////////////////////////
		// 데이터 입력
		int row = arr.length;

		for (int i = 0; i < row; i++) {

			int columns = arr[i].length;

			if (i % 2 == 0) {
				// i : 0,2
				// j증가패던
				for (int j = 0; j < columns; j++) {

					arr[i][j] = count;
					System.out.printf("%2d ", count++);
				}
			} else {
				// i :1,3
				// j감소패던

				for (int j = columns - 1; j >= 0; j--) {

					arr[i][j] = count;
					System.out.printf("%2d ", count++);
				}
			}

			System.out.println();
		}
		System.out.println();
		//   0  1   2  3
		// 0 01 02 03 04
		// 1 08 07 06 05
		// 2 09 10 11 12
		// 3 16 15 14 13

		// 순차접근 데이터 출력
		////////////////////////////////////////////////////////////////
		for (int[] a : arr) {
			for (int x : a) {
				System.out.printf("%02d ", x); // d 10진법 o 8진법 x 16진법
			}
			System.out.println();
		}
		/////////////////////////////////////////////////////////////////////

	}

}
