import java.util.Scanner;

/*
如何从键盘获取不同类型的变量：需要使用scanner类

1.导包：import java.util.Scanner;
2.Scanner的实例化:Scanner scan = new Scanner(System.in);
3.调用scanner类的相关方法(next()/nexrXxx()),来获取指定类型的变量

注意：
需要根据相应的方法，来输入指定类型的值，如果输入的数据类型和要求的类型不匹配时，会报异常，Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
        at ScannerTest.main(ScannerTest.java:24)

*/
import java.util.Scanner;
class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的年龄");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否相中了我？");
        boolean isLove = scan.nextBoolean();
        System.out.println(isLove);

        //对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串
        System.out.println("请输入你的性别：(男/女)");
        String gender = scan.next();//
        char genderChar = gender.charAt(0);
        System.out.println(genderChar);
    }
}