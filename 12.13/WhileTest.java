public class WhileTest {
    public static void main(String[] args) {
        int i = 0;
        int num = 0, count = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
                num += i;
                count++;           
            }
        i++;
        }
        System.out.println("总和为：" + num); 
        System.out.println("个数为：" + count);
    }
}
