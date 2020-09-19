import java.util.Arrays;

public class QuickSort {

	public static void main(String a[]) {
		int[] values = new int[] { 6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4,
				6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4,
				6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4,
				6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4, 6, 7, 8, 1, 2, 3, 4,
				6, 7, 8, 1, 2, 3, 4 };
		Arrays.stream(quickSort(values)).forEach(System.out::println);
	}

	private static int[] quickSort(int[] values) {
		if (values.length <= 1)
			return values;
		int pivot = values[0];
		int count = 0;
		int temp = 0;
		for (int i = 1; i < values.length; i++) {
			if (values[i] < pivot) {
				++count;
				temp = values[i];
				values[i] = values[count];
				values[count] = temp;
			}
		}
		values[0] = values[count];
		values[count] = pivot;
		int mergedArray[] = new int[values.length];
		int left[] = quickSort(Arrays.copyOfRange(values, 0, count));
		int right[] = quickSort(Arrays.copyOfRange(values, count + 1, values.length));
		count = 0;
		for (int i = 0; i < left.length; i++) {
			mergedArray[count++] = left[i];
		}
		mergedArray[count++] = pivot;
		for (int i = 0; i < right.length; i++) {
			mergedArray[count++] = right[i];
		}
		return mergedArray;
	}

}
