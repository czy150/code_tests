class AriTest {
    public static void main(String[] args) {
        int num = 12;
        int num2 = 5;
        int result1 = num / num2;
        System.out.println(result1);

        int result2 = num / num2 * num2;
        System.out.println(result2);

        double result3 = num / num2;
        System.out.println(result3);

        double result4 = num / num2 + 0.0;
        double result5 = num / (num2 + 0.0);
        double result6 = (double)num / num2;
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        
        //取模运算：%
        //结果与被模数符号一致
        //开发中，经常使用%判断是否能被除尽
        int m1 = 12;
        int m2 = -12;
        int n1 = 5;
        int n2 = -5;
        System.out.println("12 % 5 = "+ m1 % n1);
        System.out.println("12 % -5 = " + m1 % n2);
        System.out.println("-12 % 5 = " + m2 % n1);
        System.out.println("-12 % -5 = " + m2 % n2);

        //（前）++,先自增，后运算
        //（后）++
        int a1 = 10;
        int b1 = a1++;
        System.out.println(a1);
        System.out.println(b1);
        int b2 = ++a1;
        System.out.println(a1);
        System.out.println(b2);

        //注意点：自增1不会改变本身变量的数据类型
        short s1 = 10;
        //s1 = s1 + 1;//编译失败
        //s1 = (short)(s1 + 1);//正确
        s1++;
        System.out.println(s1);
        byte bb1 = 127;
        bb1++;
        System.out.println(bb1);
    }    
}
