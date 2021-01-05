package U7_two_stars;

public class S7_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		String number[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" },
				decor[] = { "Clubs", "Diamonds", "Hearts", "Spades" };
		int times = 0;
		boolean get[] = { false, false, false, false };
		while (true) {
			times++;
			int a = (int) (Math.random() * 13), b = (int) (Math.random() * 4);
			if (get[b] == false) {
				get[b] = true;
				System.out.println(number[a] + " of " + decor[b]);
			}
			if (get[0] && get[1] && get[2] && get[3])
				break;
		}
		System.out.println("Number of picks: " + times);
		input.close();
	}
}
