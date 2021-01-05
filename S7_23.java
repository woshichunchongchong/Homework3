package U7_two_stars;

public class S7_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] L = new boolean[101];
		for (int i = 1; i <= 100; ++i)
			L[i] = false;
		for (int i = 1; i <= 100; ++i)
			for (int j = i; j <= 100; j += i)
				L[j] = !L[j];
		for (int i = 1; i <= 100; ++i)
			if (L[i])
				System.out.print(i + " ");
	}

}
