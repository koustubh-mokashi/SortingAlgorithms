import java.util.Arrays;

public class MergeSort {

	public static void main(String arg[]) {
		int a[] = new int[] { 5, 6, 3, 2, 1, 9, 8, 11, 12 };
		Arrays.stream(mergeSort(a)).forEach(System.out::println);
	}

	public static int[] mergeSort(int v[]) {
		if (v.length == 1) {
			return v;
		}
		return merge(mergeSort(Arrays.copyOfRange(v, 0, v.length / 2)),
				mergeSort(Arrays.copyOfRange(v, v.length / 2, v.length)));
	}

	public static int[] merge(int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int[] merge = new int[left.length + right.length];
		int count = 0;
		while (i < left.length && j < right.length) {
			if (left[i] > right[j]) {
				merge[count++] = right[j++];
			} else {
				merge[count++] = left[i++];
			}
		}
		for (; i < left.length; i++) {
			merge[count++] = left[i];
		}
		for (; j < right.length; j++) {
			merge[count++] = right[j];
		}
		return merge;
	}

}
