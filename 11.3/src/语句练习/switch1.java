package 语句练习;

public class switch1 {

	public static void main(String[] args) {
		int f = 120;
		switch (f) {
		case 5:
			System.out.println(120);
			break;

		default:
			System.out.println(0);
			break;
		}
		/*for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\n");
		}
		System.out.println(sum);*/
		int a = 2, b = 1;
		do {
			b *= a;
		} while (b <= 100);
		System.out.println("sum = " + b);
		int s = 0;
		for (int k = 0; k <= 100; k++) {
			s += k;
		}
		System.out.println("1到100的累加和为： " + s);
		for (int i=0 ,j = 300; i <= 100; i++, j--) {
			System.out.println(i);
			System.out.println(j);
		}
	}

}
