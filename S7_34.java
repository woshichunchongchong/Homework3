package U7_two_stars;

public class S7_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		String s = input.next();
		for (int i = 0; i < sort(s).length; ++i) {
			System.out.print(sort(s)[i]);
		}
	}

	public static String[] sort(String s) {
		String[] arr = s.split("");
		for (int i = 0; i < arr.length; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
