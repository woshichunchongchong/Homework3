package U7_two_stars;

public class S7_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] list = new int[100010];
		System.out.print("Enter list: ");
		int n = input.nextInt();
		for (int i = 0; i < n; ++i)
			list[i] = input.nextInt();
		partition(list, 0, n);
		System.out.print("After the partition, the list is ");
		for (int i = 0; i < n; ++i)
			System.out.print(list[i] + " ");
	}

	public static int partition(int[] list, int first, int last) {
		int pivot = list[first], left = first, right = last;
		while (left < right) {
			while (left < right && list[right] >= pivot) {
				right--;
			}
			list[left] = list[right];
			while (left < right && list[left] <= pivot) {
				left++;
			}
			list[right] = list[left];
		}
		list[left] = pivot;// 将pivot放到正确的位置
		return left;// 返回pivot元素的正确下标
	}
}
