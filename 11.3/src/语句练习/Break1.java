package 语句练习;

public class Break1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 3) {
				System.out.println("i为3时，打破循环" + i);
				break;
			}			
		}
		int a = 100;
        int b = 200;
        // 打印一个空字符串+a+b的值
        System.out.println(b + a + "");

	}

}
