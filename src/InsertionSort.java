import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int v[] = new int[] { 5, 3, 2, 8, 10, 1 };
		int value = 0;
		for (int i = 1; i < v.length; i++) {
			value = v[i];
			int j = i-1;
			for (; j >= 0 && value < v[j]; j--) {
				v[j+1] = v[j];
			}
			v[j+1] = value;
		}
		Arrays.stream(v).forEach(System.out::println);
	}

}
