package U7_two_stars;

public class S7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int k = 0, a[] = new int[100010];
		boolean flag = true;
		for (int i = 0; i < 10; ++i) {
			int num = input.nextInt();
			for (int j = 0; j < k; ++j) {
				if (a[j] == num) {
					flag = false;
					break;
				}
			}
			if (flag) {
				a[k] = num;
				k++;
			}
			flag = true;
		}
		System.out.println("The number of distinct number is " + k);
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < k; i++) {
			System.out.print(a[i] + " ");
		}
		input.close();
	}

}
