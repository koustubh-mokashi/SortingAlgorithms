import java.util.Arrays;

public class BubbleSort {

	public static void main(String a[]) {
		int aa[] = new int[] {2,3,5,1,4,1,2,4,5};
		bubbleSort(aa);
		Arrays.stream(aa).forEach(System.out::println);
	}
	
	private static void bubbleSort(int a[]) {
		int temp = 0;
		
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length-i;j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
