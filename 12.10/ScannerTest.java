import java.util.Scanner;

/*
��δӼ��̻�ȡ��ͬ���͵ı�������Ҫʹ��scanner��

1.������import java.util.Scanner;
2.Scanner��ʵ����:Scanner scan = new Scanner(System.in);
3.����scanner�����ط���(next()/nexrXxx()),����ȡָ�����͵ı���

ע�⣺
��Ҫ������Ӧ�ķ�����������ָ�����͵�ֵ�����������������ͺ�Ҫ������Ͳ�ƥ��ʱ���ᱨ�쳣��Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
        at ScannerTest.main(ScannerTest.java:24)

*/
import java.util.Scanner;
class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("�������������");
        String name = scan.next();
        System.out.println(name);

        System.out.println("�������������");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("�������������");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("���Ƿ��������ң�");
        boolean isLove = scan.nextBoolean();
        System.out.println(isLove);

        //����char�͵Ļ�ȡ��Scannerû���ṩ��صķ�����ֻ�ܻ�ȡһ���ַ���
        System.out.println("����������Ա�(��/Ů)");
        String gender = scan.next();//
        char genderChar = gender.charAt(0);
        System.out.println(genderChar);
    }
}