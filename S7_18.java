package U7_two_stars;

public class S7_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		double[] arr = new double[100010];
		for (int i = 0; i <= 9; ++i)
			arr[i] = input.nextDouble();
		while (true) {
			boolean flag = true;
			for (int i = 1; i <= 9; ++i) {
				if (arr[i] < arr[i - 1]) {
					double temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
					flag = false;
				}
			}
			if (flag)
				break;
		}
		for (int i = 0; i <= 9; ++i)
			System.out.print(arr[i] + " ");
		input.close();
	}

}
