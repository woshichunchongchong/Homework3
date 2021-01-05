package U7_two_stars;

public class S7_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter list: ");
		int num = input.nextInt(), list[] = new int[100010];
		for (int i = 0; i < num; ++i)
			list[i] = input.nextInt();
		if (isSorted(list, num))
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
		input.close();
	}

	public static boolean isSorted(int[] list, int num) {
		for (int i = 1; i < num; i++) {
			if (list[i] < list[i - 1])
				return false;
		}
		return true;
	}
}