package U7_two_stars;

public class S7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] count = new int[101];
		System.out.print("Enter the integers between 1 and 100: ");
		for (;;) {
			int num = input.nextInt();
			if (num == 0)
				break;
			else
				count[num]++;
		}
		for (int i = 1; i <= 100; ++i) {
			if (count[i] == 1)
				System.out.println(i + " occurs " + 1 + " time ");
			else if (count[i] > 1)
				System.out.println(i + " occurs " + count[i] + " times ");
		}
	}

}