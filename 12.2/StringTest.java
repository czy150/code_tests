/*
String类型变量的使用
1.String属于引用数据类型，翻译为：字符串
2.声明String类型变量时，使用一对""
3.String类型可以和8种基本数据类型做运算，只能做连接运算“+”；
4.运算结果也是String类型


*/
class StringTest {
    public static void main(String[] args) {
        
        String s1 = "Hello World!";

        System.out.println(s1);

        String s2 = "a";
        String s3 = "";
        
        //char c = ''; //编译不通过

        //**********
        int number = 100;
        String numberStr = "学号:";
        //String info = numberStr + number;
        System.out.println(numberStr + number);

        //**************
        char c = 'a';//'a'=97 'A'=65
        int num = 10;
        String str = "hello";
        System.out.println(c + num);//107
        System.out.println(c + str);//ahello
        System.out.println(c + (num + str));//a10hello
        System.out.println((c + num) + str);//107hello
        System.out.println(str + num + c);//hello10a
    }
}