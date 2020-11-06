import java.awt.font.NumericShaper.Range;
import java.net.Socket;
import java.time.Year;

public class Array1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		double[] dou;
		dou = new double[6];
		dou[0] = 6.0;
		dou[1] = 7;
		dou[2] = 8.00;
		dou[3] = 9.00;
		dou[4] = 10.00;
		dou[5] = 11.00;
		System.out.println(dou[5]);
		int ele1 = arr[2];
		System.out.println(ele1);
		arr[4] = -1;
		System.out.println(arr[4]);
		System.out.println(arr[arr.length - 1]);
		int arr1[] = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
			System.out.println(arr1[i]);
		}
		for (int word : arr1) {
			System.out.println(word);
		}
		int[] arr2 = new int[100];
		for (int i = 0; i < 100; i++) {
			arr2[i] = i + 1;
		}
		int sum = 0;
		for (int x : arr2) {
			if (x % 2 == 0) {
				System.out.println("第" + (x / 2) + "个偶数是： " + x);
				sum += x;
			}
		}
		System.out.println(sum);
		int[] arr3 = { 1, 50, 54, 37, 68, 4, 38, 102, 97, 25 };
		int y = arr3[0];
		for (int n : arr3) {
			if (n > y) {
				y = n;
			}
		}
		System.out.println("Max number is " + y);

	}

}
