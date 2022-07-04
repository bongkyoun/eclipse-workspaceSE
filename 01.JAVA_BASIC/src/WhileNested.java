
public class WhileNested {

	public static void main(String[] args) {

		/*
		 
		 ★★★★★\n
		 ★★★★★\n
		 ★★★★★\n
		 ★★★★★\n
		 ★★★★★\n
		 
		★[0,0]★[0,1]★[0,2]★[0,3]★[0,4]
		★[1,0]★[1,1]★[1,2]★[1,3]★[1,4]
		★[2,0]★[2,1]★[2,2]★[2,3]★[2,4]
		★[3,0]★[3,1]★[3,2]★[3,3]★[3,4]
		★[4,0]★[4,1]★[4,2]★[4,3]★[4,4]
		 */
		System.out.println("1.--------------------------------");
		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				System.out.printf("%s[%d,%d]", "★", i, j);
				j++;
			} // inner while
			System.out.print("\n");
			i++;
		} // outer while

		System.out.println("2.-------------------------------");
		/*
		 ☆★★★★
		 ★☆★★★
		 ★★☆★★
		 ★★★☆★
		 ★★★★☆
		 */

		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i == j) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}

		System.out.println("3.---------------------------------");
		/*
		☆☆☆☆☆
		★☆☆☆☆
		★★☆☆☆
		★★★☆☆
		★★★★☆
		 */
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i <= j) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}
		System.out.println("4.---------------------------------");
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		System.out.println("---case1----");
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				if (i < j) {
					System.out.print("_");
				} else {
					System.out.print("★");
				}
				j++;
			}
			System.out.print("\n");
			i++;
		}
		System.out.println("---case2----");
		i = 0;
		while (i < 5) {
			int j = 0;
			while (j < i+1 ) {
				System.out.print("★");
				j++;
			}
			System.out.print("\n");
			i++;
		}

		System.out.println("5.QUIZ---------------------------------");
		/*
		★★★★★   i=0 5개
		★★★★	i=1 4개
		★★★		i=2 3개
		★★  	i=3 4개
		★		i=4 5개
		 */
		System.out.println("---case2----");
	}// end main

}// end class
