package U7_two_stars;

public class S7_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		int n1, n2;
		int[] list1 = new int[100010], list2 = new int[100010];
		System.out.print("Enter list1: ");
		n1 = input.nextInt();
		for (int i = 0; i < n1; ++i)
			list1[i] = input.nextInt();
		System.out.print("Enter list2: ");
		n2 = input.nextInt();
		for (int i = 0; i < n2; ++i)
			list2[i] = input.nextInt();
		int[] list3 = merge(list1, list2, n1, n2);
		System.out.print("The merged list is ");
		for (int i = 0; i < n1 + n2; ++i)
			System.out.print(list3[i] + " ");
		input.close();
	}

	public static int[] merge(int[] list1, int[] list2, int n1, int n2) {
		int[] list3 = new int[100010];
		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (list1[i] > list2[j]) {
				list3[k] = list2[j];
				k++;
				j++;
			} else {
				list3[k] = list1[i];
				k++;
				i++;
			}
		}
		while (i < n1) {
			list3[k] = list1[i];
			k++;
			i++;
		}
		while (j < n2) {
			list3[k] = list2[j];
			k++;
			j++;
		}
		return list3;
	}

}
